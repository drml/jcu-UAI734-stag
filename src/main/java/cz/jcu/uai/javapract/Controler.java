package cz.jcu.uai.javapract;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Drml on 4.7.2017.
 */
public class Controler implements RefreshCallback {

    private StagInterface stag;
    private Comparator comparator;
    private ITimetableDAO dao;

    private ConfigurationParameters config;

    private StateUpdateCallback stateUpdateCallback;
    private DisplayErrorCallback displayErrorCallback;

    public void registerDisplayErrorCallback(DisplayErrorCallback displayErrorCallback)
    {
        this.displayErrorCallback = displayErrorCallback;
    }

    public Controler(StagInterface stag, Comparator comparator, ITimetableDAO dao, ConfigurationParameters config)
    {
        this.stag = stag;
        this.comparator = comparator;
        this.dao = dao;
        this.config = config;
    }


    private Diff doDiff(){

//        if (dao.getOneBeforeLast() == null || dao.getLast() == null){
//            return null;
//        }


        Diff diff = comparator.diff(dao.getOneBeforeLast(),dao.getLast());

        if (diff != null){

            stateUpdateCallback.updateState(diff);
        }

        return diff;
    }

    /**
     *
     * @return TRUE if updates, FALSE if no change
     */
    private boolean doUpdate(){

        TimeTable stagTimetable = stag.fetchCurrentTimetable();
        TimeTable lastKnown = dao.getLast();

        if (lastKnown == null){
            dao.add(stagTimetable);
            return true;
        }

        if (comparator.diff(stagTimetable, lastKnown) != null) {
            dao.add(stagTimetable);
            return true;
        } return false;

    }


    public void run() {
        // TODO: implement properly
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if(doUpdate()){
                    doDiff();
                }

            }
        }, 1000, config.getRefreshRate()*1000);

    }

    public void refresh()
    {


        Diff changes = null;
        if(doUpdate()){
            changes = doDiff();
        }

        if (changes == null) {
            stateUpdateCallback.updateState(null);
        }


    }
    
    public void registerStateUpdateCallback(StateUpdateCallback stateUpdateCallback)
    {
        this.stateUpdateCallback = stateUpdateCallback;
    }
}
