package cz.jcu.uai.javapract;

import java.util.HashMap;

/**
 * Created by Drml on 4.7.2017.
 */
public class Diff {

    private HashMap<String, Subject> oldSubjects;
    private HashMap<String, Subject> newSubjects;

    public Diff(HashMap<String, Subject> oldSubjects, HashMap<String, Subject> newSubjects)
    {
        this.oldSubjects = oldSubjects;
        this.newSubjects = newSubjects;
    }

    public HashMap<String, Subject> getOldSubjects()
    {
        return oldSubjects;
    }

    public HashMap<String, Subject> getNewSubjects()
    {
        return newSubjects;
    }
}
