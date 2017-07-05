package cz.jcu.uai.javapract;


import org.apache.http.client.ClientProtocolException;
import java.io.IOException;;

/**
 * Created by Drml on 4.7.2017.
 */
public interface StagInterface {

    /**
     * Requests current timetable, returns raw JSON
     *
     * @return JSON encoded timetable
     */
    public String fetchCurrentTimetableJson()throws ClientProtocolException, IOException;

    /**
     * Requests current timetable
     * @return
     */
    public TimeTable fetchCurrentTimetable();

}
