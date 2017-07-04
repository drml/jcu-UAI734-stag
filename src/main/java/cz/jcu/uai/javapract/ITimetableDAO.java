package cz.jcu.uai.javapract;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

/**
 * Interface for Timetable collection database access object.
 * The timetables are indexed by their date property.
 * Timetables with duplicit dates are overwrtitten.
 * Supports save and load function.
 *
 * Created by Drml on 4.7.2017.
 */
public interface ITimetableDAO {

    /**
     * Adds timetable to collection.
     * Allready stored tables with same signatures are overwritten !
     *
     * @param timetable Timetable to manage
     * @return Replacd timetable, if there was one allready in the collection, NULL when there was no overwriting.
     */
    public TimeTable add(TimeTable timetable);

    /**
     * Retrive a timetable of a certain date from the collection
     *
     * @param date Date to look for
     * @return Timetable or NULL if not found
     */
    public TimeTable get(Date date);

    /**
     * Removes a timetable of a certain date from the collection.
     *
     * @param date Date to look for
     * @return TRUE if removed, FALSE if not found
     */
    public boolean remove(Date date);

    /**
     * Return latest (i.e. most recent) timetable.
     *
     * @return Timetable or NULL if no timetable found.
     */
    public TimeTable getLast();

    /**
     * Return one before latest timetable (i.e. second most recent).
     *
     * @return Timetable or NULL if no timetable found.
     */
    public TimeTable getOneBeforeLast();

    /**
     * Saves the state of the collection.
     */
    public void save() throws IOException;

    /**
     * Loads the state of the collection.
     */
    public void load() throws IOException, ClassNotFoundException;


}
