package cz.jcu.uai.javapract;

import junit.framework.TestCase;

/**
 * Created by Drml on 5.7.2017.
 */
public class StagTest extends TestCase {
    public void testFetchCurrentTimetable() throws Exception
    {
    }

    public void testFetchCurrentTimetableJson() throws Exception
    {

        Configuration configuration = new Configuration("testovaci.ini");
        Parser parser = new Parser();
        StagInterface stag = new Stag(configuration.getProps(),parser);

        System.out.println(stag.fetchCurrentTimetableJson());


    }

}