package cz.jcu.uai.javapract;

/**
 * Created by Drml on 4.7.2017.
 */
public abstract class StagAbstract {

    protected String apiUrl;
    protected String studentId;
    protected String semester;
    protected Parser parser;

    public StagAbstract(ConfigurationParameters configurationParameters, Parser parser)
    {
        this.apiUrl = configurationParameters.getApiUrl();
        this.studentId = configurationParameters.getStudentId();
        this.semester = configurationParameters.getSemester();
        this.parser = parser;
    }

    public void setApiUrl(String apiUrl)
    {
        this.apiUrl = apiUrl;
    }

    public void setStudentId(String studentId)
    {
        this.studentId = studentId;
    }

    public void setSemester(String semester)
    {
        this.semester = semester;
    }

    public void setParser(Parser parser)
    {
        this.parser = parser;
    }
}
