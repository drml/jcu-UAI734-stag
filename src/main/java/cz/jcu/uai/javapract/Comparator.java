package cz.jcu.uai.javapract;

import java.sql.Time;

/**
 * Trida porovnanva roydily meyi dvema royvrhy
 *
 * Created by Drml on 4.7.2017.
 */
public class Comparator {

    private TimeTable oldTable;
    private TimeTable newTable;

    /**
     * Porovna dva rozvrhy a vrati rozdily, ve formatu Diff.
     * Vrati NULL pokud jsou stejne.
     * @see Diff
     *
     * @param oldTable Stary rozvrh
     * @param newTable Novy rozvrh
     * @return Rozdilovy objekt, NULL pokud jsou stejne
     */
    public Diff diff(TimeTable oldTable, TimeTable newTable){
        // TODO: implement
        return null;
    }



}
