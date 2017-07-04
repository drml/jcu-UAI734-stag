package cz.jcu.uai.javapract;

import cz.jcu.uai.javapract.Parser;

/**
 * Created by Drml on 4.7.2017.
 */
public abstract class StagAbstract {

    protected String apiUrl;
    protected String studentId;
    protected String semester;
    protected Parser parser;

    public StagAbstract(String apiUrl, String studentId, String semester, Parser parser)
    {
        this.apiUrl = apiUrl;
        this.studentId = studentId;
        this.semester = semester;
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
