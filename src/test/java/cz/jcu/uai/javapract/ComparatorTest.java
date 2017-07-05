package cz.jcu.uai.javapract;

import junit.framework.TestCase;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * Created by Karolína on 4.7.2017.
 */
public class ComparatorTest extends TestCase {
    public void testDiff() throws Exception {

        Comparator testovaci = new Comparator();

        TimeTable stary = createTimeTableStary();
        TimeTable novy = createTimeTableNovy();
        TimeTable stejny = createTimeTableStary();

        Diff vysledek = testovaci.diff(stary, novy);
        Diff vysledek1 = testovaci.diff(stary, stejny);


        HashMap<String, Subject> vysledekStare;
        HashMap<String, Subject> vysledekNove;

        vysledekStare = vysledek.getOldSubjects();


        vysledekNove = vysledek.getNewSubjects();
        for (String s : vysledekStare.keySet()) {

            Subject subjectStary = vysledekStare.get(s);
            Subject subjectNovy = vysledekNove.get(s);

            assertTrue(vysledek !=null && !subjectNovy.equals(subjectStary));
            //testuje jak se změnil čas
            assertTrue(vysledek !=null && !vysledekStare.get("OJZ230Př").getTimeStart().equals(vysledekNove.get("OJZ230Př").getTimeStart()));
            assertTrue(vysledek !=null && !vysledekStare.get("OJZ230Př").getTimeEnd().equals(vysledekNove.get("OJZ230Př").getTimeEnd()));
            //testuje, zda vyhodí null, pokud jsou rozvrhy stejné - nenastala žádná změna
            assertTrue(vysledek1 == null);

        }
        assertTrue(testovaci.diff(stary, novy) != null);

    }

    //testovaci data - stary rozvrh
    private TimeTable createTimeTableStary(){

        final String dateString = "04.07.2017";
        SimpleDateFormat formater = new SimpleDateFormat("dd.MM.yyyy");

        Date timetableDate = null;
        try {
            timetableDate = formater.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        ArrayList<Subject> testSubs = new ArrayList<>();
        testSubs.add(new Subject("Př","Teoretická informatika",732,"UAI","08:00","09:30", Calendar.MONDAY, "BB", "1","3.10.2016","2.1.2017",true));
        testSubs.add(new Subject("Př","Bakalářská angličtina NS 3",230,"OJZ","10:00","11:30", Calendar.TUESDAY, "BB", "4","3.10.2016","2.1.2017",true));
        testSubs.add(new Subject("Cv","Teoretická informatika",732,"UAI","14:30","16:00", Calendar.TUESDAY, "AV", "Pč4","3.10.2016","2.1.2017",true));


        return new TimeTable (timetableDate, testSubs);

    }

    //testovaci data - novy rozvrh
    private TimeTable createTimeTableNovy(){

        final String dateString = "4.7.2017";
        SimpleDateFormat formater = new SimpleDateFormat("dd.MM.yyyy");

        Date timetableDate = null;
        try {
            timetableDate = formater.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        ArrayList<Subject> testSubs = new ArrayList<Subject>();
        testSubs.add(new Subject("Př","Teoretická informatika",732,"UAI","08:00","09:30", Calendar.MONDAY, "BB", "1","3.10.2016","2.1.2017",true));
        testSubs.add(new Subject("Př","Bakalářská angličtina NS 3",230,"OJZ","12:00","13:30", Calendar.TUESDAY, "BB", "4","3.10.2016","2.1.2017",true));
        testSubs.add(new Subject("Cv","Teoretická informatika",732,"UAI","14:30","16:00", Calendar.TUESDAY, "AV", "Pč4","3.10.2016","2.1.2017",true));
        testSubs.add(new Subject("Cv","Teoretická informatika",733,"UAI","14:30","16:00", Calendar.TUESDAY, "AV", "Pč4","3.10.2016","2.1.2017",true));


        return new TimeTable(timetableDate, testSubs);
    }


}