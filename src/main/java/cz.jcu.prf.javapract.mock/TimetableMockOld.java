package cz.jcu.prf.javapract.mock;

import cz.jcu.uai.javapract.Subject;
import cz.jcu.uai.javapract.TimeTable;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Drml on 4.7.2017.
 */
public class TimetableMockOld extends TimeTable {
    public TimetableMockOld(){

        Date today = new Date();
        ArrayList<Subject> testSubs = new ArrayList<Subject>();
        testSubs.add(new Subject("Př","Teoretická informatika",732,"UAI","08:00","09:30", Calendar.MONDAY, "BB", "1","3.10.2016","2.1.2017",true));
        testSubs.add(new Subject("Př","Bakalářská angličtina NS 3",230,"OJZ","10:00","11:30", Calendar.TUESDAY, "BB", "4","3.10.2016","2.1.2017",true));
        testSubs.add(new Subject("Cv","Teoretická informatika",732,"UAI","14:30","16:00", Calendar.TUESDAY, "AV", "Pč4","3.10.2016","2.1.2017",true));


        this.CreateTimeTable(today, testSubs);
    }
}
