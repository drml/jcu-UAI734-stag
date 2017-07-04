package cz.jcu.uai.javapract;


/**
 * Created by Drml on 4.7.2017.
 */
public interface StagInterface {

    /**
     * Requests current timetable, returns raw JSON
     *
     * @return JSON encoded timetable
     */
    public String fetchCurrentTimetableJson();

    /**
     * Requests current timetable
     * @return
     */
    public TimeTable fetchCurrentTimetable();

}
