package cz.jcu.uai.javapract;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by Drml on 4.7.2017.
 */
public class Stag extends StagAbstract implements StagInterface {

    public Stag(ConfigurationParameters configurationParameters, Parser parser)
    {
        super(configurationParameters, parser);
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
