package cz.jcu.uai.javapract;


import org.apache.http.client.ClientProtocolException;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;;

/**
 * Created by Drml on 4.7.2017.
 */
public interface StagInterface {

    /**
     * Requests current timetable, returns raw JSON
     *
     * @return JSON encoded timetable
     */
    public String fetchCurrentTimetableJson() throws ClientProtocolException, IOException, KeyStoreException, NoSuchAlgorithmException, KeyManagementException, URISyntaxException;

    /**
     * Requests current timetable
     * @return
     */
    public TimeTable fetchCurrentTimetable();

}
