package cz.jcu.uai.javapract;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;

/**
 * Created by Drml on 4.7.2017.
 */
@SuppressWarnings("ALL")
public class GUI implements StateUpdateCallback, DisplayErrorCallback{

    private TrayIcon trayIcon;
    private SystemTray tray;

    ConfigurationParameters config;

    private Calendar timeOfLastChange;
    private Calendar actualTime;


    private RefreshCallback controler;
    private Diff diff;

    private HashSet<String> zmeny;
    private final URL url;
    private final URL urlOfFile;
    private final File file;

    public void registerRefreshCallback(RefreshCallback refreshCallback) {
        this.controler = refreshCallback;
    }


    GUI(Configuration configuration) throws MalformedURLException {


        config = configuration.getProps();
        file = new File(configuration.getConfigFilename());
        url = new URL(config.getDoubleClickUrl());

        zmeny = new HashSet<>();
        actualTime = Calendar.getInstance();
        timeOfLastChange = Calendar.getInstance();
        urlOfFile = GUI.class.getResource("/logo.png");
        createMenu();


    }


    private String formatToHumanReadable(Diff diff){
        zmeny.addAll(diff.getOldSubjects().keySet());
        zmeny.addAll(diff.getNewSubjects().keySet());

        StringBuilder finalni = new StringBuilder();

        for (String setItem: zmeny) {
            for (Map.Entry<String, Subject> entry : diff.getNewSubjects().entrySet())
            {
                Subject item = entry.getValue();
                if(item == null) {
                    for (Map.Entry<String, Subject> entryold : diff.getOldSubjects().entrySet()) {
                        String key = entryold.getKey();
                        if (key == setItem) {
                            finalni.append("○ ");
                            finalni.append(item.getName() + " ");
                            finalni.append(item.getSubjectID() + " ");
                            finalni.append(item.getSubjectCode() + " ");
                            finalni.append(item.getType()+"\n");
                        }
                    }
                }else {
                    String key = entry.getKey();
                    if (key == setItem) {
                        finalni.append("○ ");
                        finalni.append(item.getName() + " ");
                        finalni.append(item.getSubjectID() + " ");
                        finalni.append(item.getSubjectCode() + " ");
                        finalni.append(item.getType()+"\n");
                    }
                }

            }
        }
        finalni.append("DoubleClick on Icon in tray to open STAG ");
        return finalni.toString();
    }

    protected void createMenu() throws MalformedURLException {
        //Check the SystemTray support
        if (!SystemTray.isSupported()) {
            System.out.println("SystemTray is not supported");
            return;
        }

        final PopupMenu popup = new PopupMenu();

        Image image = Toolkit.getDefaultToolkit().getImage(urlOfFile);
        trayIcon = new TrayIcon(image, "Stag Watchdog", popup);
        tray = SystemTray.getSystemTray();

        // Create a popup menu components
        MenuItem aboutItem = new MenuItem("About");
        MenuItem test = new MenuItem("Check for update");
        MenuItem config = new MenuItem("open Config");
        MenuItem exitItem = new MenuItem("Exit");

        //Add components to popup menu
        popup.add(aboutItem);
        popup.addSeparator();
        popup.add(test);
        popup.addSeparator();
        popup.add(config);
        popup.add(exitItem);

        trayIcon.setPopupMenu(popup);

        try {
            tray.add(trayIcon);
        } catch (AWTException e) {
            System.out.println("TrayIcon could not be added.");
            return;
        }

        trayIcon.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (e.getButton() == MouseEvent.BUTTON1 && e.getClickCount() == 2) {
                   openWebpage(url);
                }
            }
        });


        aboutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "JCU Stag TimeTable WatchDog\n\nDoubleClick to open timetable in browser\nRightClick to show MENU\n\n" +
                                "Aplikace na detekci zmen v rozvrhu. \nPraktikum programovani v jave\n" +
                                "Tym : Ondrej Doktor, Jiri Hauser, Jakub Kocum, Kaja Pestova\n" +
                                "2017\ngithub: https://github.com/drml/jcu-UAI734-stag.git");
            }
        });

        test.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controler.refresh();
                System.out.println("refresh action");
            }
        });

        //test.addActionListener(new ShowMessageListener(trayIcon, "Warning Title", "Warning", TrayIcon.MessageType.WARNING));
        config.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (Desktop.isDesktopSupported()) {
                    System.out.println("config file opening");
                    try {
                        Desktop.getDesktop().edit(file);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                } else {
                    System.out.println("config cannot be opened");
                }

            }
        });
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tray.remove(trayIcon);
                System.exit(0);
            }
        });
    }
    public void refresh(){
        controler.refresh();
    }

    @Override
    public void updateState(Diff state) {
      // kdyz neni zmena rozvrhu
        if (state == null) {
          System.out.println("Up to date");
            trayIcon.displayMessage("No Changes", "Timetable is up to date\nLast Changed: "+timeOfLastChange.getTime(),TrayIcon.MessageType.INFO );
          if (timeOfLastChange == actualTime)
              System.out.println(timeOfLastChange.getTime());

          else
              System.out.println("last change:"+ timeOfLastChange.getTime());
          if (diff == null)
              System.out.println("first run of app");
      } else  {
        // zmena rozvrhu
          timeOfLastChange.setTime(actualTime.getTime());
          diff = state;
          System.out.println("Updatujeme");
          System.out.println(timeOfLastChange.getTime());
          System.out.println(formatToHumanReadable(diff));
            trayIcon.displayMessage("TimeTable Changed", "Changes in subjects:\n "+formatToHumanReadable(diff),TrayIcon.MessageType.WARNING );
      }

    }

    @Override
    public void displayError(String message) {
        trayIcon.displayMessage("Error occured", message,TrayIcon.MessageType.ERROR );
    }


    private static class ShowMessageListener implements ActionListener {

        private TrayIcon trayIcon;
        private String title;
        private String message;
        private TrayIcon.MessageType messageType;
        private final URL url = new URL("https://wstag.jcu.cz/portal/studium/moje-studium");

        ShowMessageListener(TrayIcon trayIcon, String title, String message, TrayIcon.MessageType messageType) throws MalformedURLException {
            this.trayIcon = trayIcon;
            this.title = title;
            this.message = message;
            this.messageType = messageType;
        }

        public void actionPerformed(ActionEvent e) {
            trayIcon.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    System.out.println("Message Clicked");
                    openWebpage(url);
                }
            });
            trayIcon.displayMessage(title, message, messageType);
        }
    }



    public static void openWebpage(URI uri) {
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                desktop.browse(uri);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void openWebpage(URL url) {
        try {
            openWebpage(url.toURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

}

