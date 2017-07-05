package cz.jcu.uai.javapract;

import junit.framework.TestCase;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Timetable DAO test
 *
 * Created by Drml on 4.7.2017.
 */
public class TimetableDAOTest extends TestCase {

    TimeTable tt1, tt2;
    ITimetableDAO dao;

    public void setUp() throws Exception
    {
        super.setUp();

        tt1 = createTimeTableStary();
        tt2 = createTimeTableNovy();



        dao = new TimetableDAO("testStorage.db");
    }

    public void testAddAndGet() throws Exception
    {
        dao = new TimetableDAO("testStorage.db");
        // make sure it does not exist
        assertNull(dao.get(tt1.getUpdate()));

        // try to add
        dao.add(tt1);

        // test if present
        assertNotNull(dao.get(tt1.getUpdate()));
        assertEquals(dao.get(tt1.getUpdate()), tt1);

        //try to add again
        assertNotNull(dao.get(tt1.getUpdate()));
        assertEquals(dao.get(tt1.getUpdate()), tt1);

    }

    public void testRemove() throws Exception
    {
        dao = new TimetableDAO("testStorage.db");
        // make sure it does not exist
        assertNull(dao.get(tt2.getUpdate()));

        // try to add
        assertNull(dao.add(tt2));

        // test if present
        assertNotNull(dao.get(tt2.getUpdate()));

        // try to remove
        assertTrue(dao.remove(tt2.getUpdate()));

        // test if not present
        assertNull(dao.get(tt2.getUpdate()));

        // try to remove non-existent
        assertFalse(dao.remove(tt2.getUpdate()));

    }

    public void testGetLast() throws Exception
    {
        dao = new TimetableDAO("testStorage.db");
        dao.add(tt1);
        dao.add(tt2);       // newer

        TimeTable last = dao.getLast();
        assertNotNull(last);

        assertEquals(tt2, last);
    }

    public void testGetOneBeforeLast() throws Exception
    {
        dao = new TimetableDAO("testStorage.db");
        dao.add(tt1);
        dao.add(tt2);       // newer

        TimeTable last = dao.getOneBeforeLast();
        assertNotNull(last);

        assertEquals(tt1, last);
    }

    public void testSave() throws Exception
    {
        dao = new TimetableDAO("testStorage.db");
        dao.add(tt1);
        dao.add(tt2);       // newer

        try {
            dao.save();
        } catch (IOException e){
            e.printStackTrace();
            fail("nepodarilo se ulozit: "+e.getMessage());

        }

    }

    public void testLoad() throws Exception
    {
        TimetableDAO loaded = new TimetableDAO("testStorage.db");

        // confirm there are none of theese
        assertNull(loaded.get(tt1.getUpdate()));
        assertNull(loaded.get(tt2.getUpdate()));

        // try to load
        try {
            loaded.load();
        } catch (IOException e){
            fail("nepodarilo se nacist: "+e.getMessage());
        }

        // check if loaded
        assertNotNull(loaded.get(tt1.getUpdate()));
        assertNotNull(loaded.get(tt2.getUpdate()));

        loaded.setSaveFilename("dsjfsfajjiwfjdsfjspap.nonexistent");
        try {
            loaded.load();
            fail("Nejak nam to nacita i kdyz nema z ceho :-/");
        } catch (IOException e){
            // expected
        }

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