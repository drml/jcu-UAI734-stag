package cz.jcu.uai.javapract;

/**
 * Created by Drml on 4.7.2017.
 */
public class Stag {

    private String $apiUrl;
    private String $studentId;
    private String $semester;

    public void set$studentId(String $studentId)
    {
        this.$studentId = $studentId;
    }

    public void set$semester(String $semester)
    {
        this.$semester = $semester;
    }

    public Stag(String $apiUrl, String $studentId, String $semester)
    {

        this.$apiUrl = $apiUrl;
        this.$studentId = $studentId;
        this.$semester = $semester;
    }

    /**
     * Requests current timetable, returns raw JSON
     *
     * @return JSON encoded timetable
     */
    public String fetchCurrentTimetable(){

        // TODO: Implement
        return null;
    }




}
