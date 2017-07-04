package cz.jcu.uai.javapract;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by Drml on 4.7.2017.
 */
public class Stag extends StagAbstract implements StagInterface {

    public Stag(String apiUrl, String studentId, String semester, Parser parser)
    {
        super(apiUrl, studentId, semester, parser);
    }

    public TimeTable fetchCurrentTimetable()
    {
        throw new NotImplementedException();
    }

    public String fetchCurrentTimetableJson()
    {
        throw new NotImplementedException();
    }
}
