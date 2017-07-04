package cz.jcu.uai.javapract;

import junit.framework.TestCase;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by Drml on 4.7.2017.
 */
public class ParserTest extends TestCase {

    public void testParse() throws Exception
    {

        Parser mujparser = new Parser();
        StagInterface mock = new StagMock(null,null,null,null);

        String json = mock.fetchCurrentTimetableJson();

        TimeTable vysledek = mujparser.parse(json);

        // overit ze je am co checme

        HashMap<String, Subject> pondeli = vysledek.getDay(Calendar.MONDAY);
        assertNotNull(pondeli);


        Subject prvniprednaska = pondeli.get("UAI667Př");

        assertNotNull(prvniprednaska);
        assertEquals("BB",prvniprednaska.getBuilding());
        assertEquals("08:00",prvniprednaska.getTimeStart());


    }

}