package cz.jcu.uai.javapract.mock.mock;

import cz.jcu.uai.javapract.Subject;
import cz.jcu.uai.javapract.SubjectType;
import cz.jcu.uai.javapract.TimeTable;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Drml on 4.7.2017.
 */
public class TimetableMockNew extends TimeTable {

    public static final String dateString = "4.7.2017";

    public TimetableMockNew()
    {

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


        this.CreateTimeTable(timetableDate, testSubs);
    }
}
