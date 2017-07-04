package cz.jcu.uai.javapract;

import java.io.*;
import java.util.Date;
import java.util.TreeMap;

/**
 * Timetable database access object.
 * @see ITimetableDAO
 *
 * Created by Drml on 4.7.2017.
 */
public class TimetableDAO implements ITimetableDAO, Serializable {


    private TreeMap<Date, TimeTable> collection;
    private String saveFilename;


    public TimetableDAO(String saveFilename)
    {
        this.collection = new TreeMap<>();
        this.saveFilename = saveFilename;

    }

    public TimeTable add(TimeTable timetable)
    {
        return collection.put(timetable.getUpdate(), timetable);
    }

    public TimeTable get(Date date)
    {
        return collection.get(date);
    }

    public boolean remove(Date date)
    {
        TimeTable removed = collection.remove(date);
        return (removed != null);
    }

    public TimeTable getLast()
    {
        return this.get(collection.lastKey());
    }

    public TimeTable getOneBeforeLast()
    {
        return this.get(collection.lowerKey(collection.lastKey()));
    }

    public void save() throws IOException
    {
        FileOutputStream fileIn = new FileOutputStream(saveFilename);
        ObjectOutputStream objectOut = new ObjectOutputStream(fileIn);
        objectOut.writeObject(collection);
    }

    public void load() throws IOException, ClassNotFoundException
    {
        FileInputStream f_out = new FileInputStream(saveFilename);
        ObjectInputStream obj_out = new ObjectInputStream(f_out);
        collection = (TreeMap<Date,TimeTable>) obj_out.readObject();

    }

    public void setSaveFilename(String saveFilename)
    {
        this.saveFilename = saveFilename;
    }
}
