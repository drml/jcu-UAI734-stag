package cz.jcu.uai.javapract;

/**
 * Represents type of the subject
 *
 * Created by Drml on 4.7.2017.
 */
public enum SubjectType {
    CVICENI("Cv"),
    PREDNASKA("Př");

    private String represendation;

    SubjectType(String represendation)
    {
        this.represendation = represendation;
    }

    @Override
    public String toString()
    {
        return represendation;
    }
}
