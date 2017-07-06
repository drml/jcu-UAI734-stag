package cz.jcu.uai.javapract.mock.mock;

import cz.jcu.uai.javapract.ITimetableDAO;
import cz.jcu.uai.javapract.Subject;
import cz.jcu.uai.javapract.TimeTable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * DAO mock TODO: smazat?
 *
 * Created by Drml on 4.7.2017.
 */
public class TimetableDAOMock implements ITimetableDAO
{
    TimeTable stary;
    TimeTable novy;

    public TimetableDAOMock()
    {

        stary = createTimeTableStary();
        novy = createTimeTableNovy();
    }

    public TimeTable add(TimeTable timetable)
    {
        return null;
    }

    public TimeTable get(Date date)
    {

        SimpleDateFormat formater = new java.text.SimpleDateFormat("dd.MM.yyyy");
        String dateInString = formater.format(date);


        if (dateInString.equals(formater.format(novy.getUpdate()))){
            return novy;

        } else if (dateInString.equals(formater.format(stary.getUpdate()))) {
            return stary;
        }

        return null;
    }

    public boolean remove(Date date)
    {
        return false;
    }

    public TimeTable getLast()
    {
        return novy;
    }

    public TimeTable getOneBeforeLast()
    {
        return stary;
    }

    public void save()
    {

    }

    public boolean load()
    {return true;
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
