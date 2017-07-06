package cz.jcu.uai.javapract;


import cz.jcu.uai.javapract.mock.mock.TimetableDAOMock;

import javax.swing.*;
import java.io.IOException;
import java.net.MalformedURLException;

/**
 *
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );




        // TODO: dodelat navazani a handlery

        ///////// Jikovo věci ke GUI

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        //Schedule a job for the event-dispatching thread:
        //adding TrayIcon.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {

                    String error = null;

                    Configuration configuration = null;
                    try {
                        configuration = new Configuration("config.ini");
                    } catch (NotConfiguredException e) {
                        error = "Nepodařilo se načíst konfiguraci, obnoveny výchozí hodnoty. Restartujte aplikaci";
                    }

                    Parser parser = new Parser();
                    StagInterface stag = new Stag(configuration.getProps(), parser);
                    Comparator comparator = new Comparator();
                    ITimetableDAO dao = new TimetableDAO("timetables.db");//("timetables.db");

                    dao.load();


                    Controler controler = new Controler(stag, comparator, dao, configuration.getProps());

                    GUI gui = new GUI(configuration);

                    gui.registerRefreshCallback(controler);
                    controler.registerStateUpdateCallback(gui);
                    controler.registerDisplayErrorCallback(gui);

                    if(error != null){
                        gui.displayError(error);
                    }

                    controler.run();


                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
