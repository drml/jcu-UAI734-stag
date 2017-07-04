package cz.jcu.uai.javapract;

/**
 * Created by Drml on 4.7.2017.
 */
public class ConfigurationParameters {

    private String apiUrl;
    private String studentID;
    private String semester;
    private int refreshRate;

    public String getApiUrl()
    {
        return apiUrl;
    }

    public String getStudentId()
    {
        return studentID;
    }

    public String getSemester()
    {
        return semester;
    }

    public int getRefreshRate()
    {
        return refreshRate;
    }

    public ConfigurationParameters(String apiUrl, String studentID, String semester, int refreshRate)
    {

        this.apiUrl = apiUrl;
        this.studentID = studentID;
        this.semester = semester;
        this.refreshRate = refreshRate;
    }
}
