package cz.jcu.uai.javapract;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Drml on 4.7.2017.
 */
@SuppressWarnings("ALL")
public class GUI implements StateUpdateCallback {

    private TrayIcon trayIcon;
    private SystemTray tray;

    private Calendar timeOfLastChange;
    private Calendar actualTime;

    private RefreshCallback controler;
    private Diff diff;

    private HashSet<String> zmeny;

    public void registerRefreshCallback(RefreshCallback refreshCallback) {
        this.controler = refreshCallback;
    }

    GUI(){
        actualTime = Calendar.getInstance();
        timeOfLastChange = Calendar.getInstance();
        createMenu();

    }


    public void displayChanges(HashMap<String, Subject> oldSubjects, HashMap<String, Subject> newSubjects){

    }

    private String formatToHumanReadable(HashMap<String, Subject> oldSubjects, HashMap<String, Subject> newSubjects){
        // TODO: implement
        return null;
    }

    protected void createMenu() {
        //Check the SystemTray support
        if (!SystemTray.isSupported()) {
            System.out.println("SystemTray is not supported");
            return;
        }

        final PopupMenu popup = new PopupMenu();

        Image image = Toolkit.getDefaultToolkit().getImage("target/artifacts/images/logo.png");
        trayIcon = new TrayIcon(image, "Stag Watchdog", popup);
        tray = SystemTray.getSystemTray();

        // Create a popup menu components
        MenuItem aboutItem = new MenuItem("About");

        Menu displayMenu = new Menu("Display");
        MenuItem errorItem = new MenuItem("Error");
        MenuItem warningItem = new MenuItem("Warning");
        MenuItem infoItem = new MenuItem("Info");
        MenuItem noneItem = new MenuItem("None");
        MenuItem exitItem = new MenuItem("Exit");

        //Add components to popup menu
        popup.add(aboutItem);
        popup.addSeparator();
        popup.add(displayMenu);
        displayMenu.add(errorItem);
        displayMenu.add(warningItem);
        displayMenu.add(infoItem);
        displayMenu.add(noneItem);
        popup.add(exitItem);

        trayIcon.setPopupMenu(popup);



        try {
            tray.add(trayIcon);
        } catch (AWTException e) {
            System.out.println("TrayIcon could not be added.");
            return;
        }

        trayIcon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "This dialog box is run from System Tray");
            }
        });

        aboutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Aplikace na detekci zmen v rozvrhu. Praktikum programovani v jave\n" +
                                "Tym : Ondrej Doktor, Jiri Hauser, Jakub Kocum, Kaja Pestova\n" +
                                "2017 - github: https://github.com/drml/jcu-UAI734-stag.git");
            }
        });


        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuItem item = (MenuItem) e.getSource();
                //TrayIcon.MessageType type = null;
                System.out.println(item.getLabel());
                if ("Error".equals(item.getLabel())) {
                    //type = TrayIcon.MessageType.ERROR;
                    trayIcon.displayMessage("Sun TrayIcon Demo",
                            "This is an error message" +
                                    "This is an error message" +
                                    "This is an error message" +
                                    "This is an error message" +
                                    "This is an error message" +
                                    "This is an error messageThis is an error messageThis is an error messageThis is an error messageThis is an error messageThis is an error messageThis is an error message" +
                                    "This is an error message" +
                                    "" +
                                    "", TrayIcon.MessageType.ERROR);

                } else if ("Warning".equals(item.getLabel())) {
                    //type = TrayIcon.MessageType.WARNING;
                    trayIcon.displayMessage("Sun TrayIcon Demo",
                            "This is a warning message", TrayIcon.MessageType.WARNING);

                } else if ("Info".equals(item.getLabel())) {
                    //type = TrayIcon.MessageType.INFO;
                    trayIcon.displayMessage("Sun TrayIcon Demo",
                            "This is an info message", TrayIcon.MessageType.INFO);

                } else if ("None".equals(item.getLabel())) {
                    //type = TrayIcon.MessageType.NONE;
                    trayIcon.displayMessage("Sun TrayIcon Demo",
                            "This is an ordinary message", TrayIcon.MessageType.NONE);
                }
            }
        };

        errorItem.addActionListener(listener);
        warningItem.addActionListener(listener);
        infoItem.addActionListener(listener);
        noneItem.addActionListener(listener);

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tray.remove(trayIcon);
                System.exit(0);
            }
        });
    }

    @Override
    public void updateState(Diff state) {
      // kdyz neni zmena rozvrhu
        if (state == null) {
          System.out.println("Up to date");
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

      }

    }
}
