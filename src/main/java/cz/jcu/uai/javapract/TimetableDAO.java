package cz.jcu.uai.javapract;

import java.io.*;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.TreeMap;

/**
 * Timetable database access object.
 * @see ITimetableDAO
 *
 * Created by Drml on 4.7.2017.
 */
public class TimetableDAO implements ITimetableDAO {


    private TreeMap<Date, TimeTable> collection;
    private String saveFilename;


    public TimetableDAO(String saveFilename)
    {
        this.collection = new TreeMap<>();
        this.saveFilename = saveFilename;

    }

    public TimeTable add(TimeTable timetable)
    {
        TimeTable result = collection.put(timetable.getUpdate(), timetable);
        save();
        return result;
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
        try {
            collection.lastKey();
        } catch (NoSuchElementException e){
            return null;
        }

        if (collection.lastKey() == null){
            return null;
        }
        return this.get(collection.lastKey());
    }

    public TimeTable getOneBeforeLast()
    {

        try {
            collection.lastKey();
            collection.lowerKey(collection.lastKey());
        } catch (NoSuchElementException e){
            return null;
        }
        if( collection.lastKey() == null){
            return null;
        }

        if(collection.lowerKey(collection.lastKey()) == null){
            return null;
        }



        return this.get(collection.lowerKey(collection.lastKey()));
    }

    public void save()
    {
        FileOutputStream fileIn = null;
        try {
            fileIn = new FileOutputStream(saveFilename);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileIn);
            objectOut.writeObject(collection);
            fileIn.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean load()
    {

        FileInputStream f_out = null;
        try {
            f_out = new FileInputStream(saveFilename);
            ObjectInputStream obj_out = new ObjectInputStream(f_out);
            collection = (TreeMap<Date,TimeTable>) obj_out.readObject();
            f_out.close();
        } catch (FileNotFoundException e) {
            return false;
        } catch (IOException e) {
            return false;
        } catch (ClassNotFoundException e) {
            return false;
        }
        return true;

    }

    public void setSaveFilename(String saveFilename)
    {
        this.saveFilename = saveFilename;
    }
}
