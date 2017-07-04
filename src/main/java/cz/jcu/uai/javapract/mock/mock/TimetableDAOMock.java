package cz.jcu.uai.javapract.mock.mock;

import cz.jcu.uai.javapract.ITimetableDAO;
import cz.jcu.uai.javapract.TimeTable;
import cz.jcu.uai.javapract.TimetableDAO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * DAO mock TODO: smazat?
 *
 * Created by Drml on 4.7.2017.
 */
public class TimetableDAOMock implements ITimetableDAO
{
    public TimeTable add(TimeTable timetable)
    {
        return null;
    }

    public TimeTable get(Date date)
    {
        String dateInString = new java.text.SimpleDateFormat("dd.MM.yyyy")
                .format(date);

        if (dateInString.equals(TimetableMockNew.dateString)){
            return new TimetableMockNew();

        } else if (dateInString.equals(TimetableMockOld.dateString)) {
            return new TimetableMockOld();
        }

        return null;
    }

    public boolean remove(Date date)
    {
        return false;
    }

    public TimeTable getLast()
    {
        return new TimetableMockNew();
    }

    public TimeTable getOneBeforeLast()
    {
        return new TimetableMockOld();
    }

    public void save()
    {

    }

    public void load()
    {

    }
}
