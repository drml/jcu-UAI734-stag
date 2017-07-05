package cz.jcu.uai.javapract;

import junit.framework.TestCase;

import javax.swing.*;
import java.net.MalformedURLException;
import java.util.Calendar;
import java.util.HashMap;

/**
 * Created by Jirka on 05.07.2017.
 */
public class GUITest extends TestCase {
    
    private final GUI gui;

    public GUITest() throws MalformedURLException {

        Configuration config = null;
        try {
            config = new Configuration("config.ini");
        } catch (NotConfiguredException e) {
            e.printStackTrace();
        }
        gui = new GUI(config);
    }


    public void testRegisterRefreshCallback() throws Exception {
    }

    public void testDisplayChanges() throws Exception {
    }

    public void testUpdateState() throws Exception {

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException | IllegalAccessException | ClassNotFoundException | InstantiationException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        //Schedule a job for the event-dispatching thread:
        //adding TrayIcon.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    gui.createMenu();
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }
        });


        Subject s1 = new Subject("Př","Teoretická informatika",732,"UAI","08:00","09:30", Calendar.MONDAY, "BB", "1","3.10.2016","2.1.2017",true);
        Subject s2 = new Subject("Př","Bakalářská angličtina NS 3",230,"OJZ","12:00","13:30", Calendar.TUESDAY, "BB", "4","3.10.2016","2.1.2017",true);
        
        HashMap<String, Subject> subsNew = new HashMap<>();
        subsNew.put(s1.getId(),s1);
        subsNew.put(s2.getId(),s2);
        
        HashMap<String, Subject> subsOld = new HashMap<>();
        subsOld.put(s1.getId(),s1);
        subsOld.put(s2.getId(),null);

        Diff mockDiff = new Diff(subsOld,subsNew);

        gui.updateState(mockDiff);
        
        gui.updateState(null);

        gui.displayError("test error");

    }

}