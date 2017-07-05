package cz.jcu.uai.javapract;

import java.sql.Time;
import java.util.HashMap;
import java.util.Map;

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

        HashMap<String, Subject> allOldSubjects = new HashMap<String, Subject>();

        for (Map.Entry<Integer, HashMap<String, Subject>> polozka : oldTable.getContent().entrySet())
        {
            for (Map.Entry<String, Subject> predmet : polozka.getValue().entrySet()){

                allOldSubjects.put(predmet.getKey(),predmet.getValue());

            }

        }

        // jeste jednou pro allNewSubjects

        HashMap<String, Subject> allNewSubjects = new HashMap<String, Subject>();

        for (Map.Entry<Integer, HashMap<String, Subject>> polozka : newTable.getContent().entrySet())
        {
            for (Map.Entry<String, Subject> predmet : polozka.getValue().entrySet()){

                allNewSubjects.put(predmet.getKey(),predmet.getValue());

            }

        }

        //co dělat když bude nových předmětů více než starých
        HashMap<String, Subject> masterSeznam;
        if (allOldSubjects.size() > allNewSubjects.size()){
            masterSeznam = allOldSubjects;
        } else {
            masterSeznam = allNewSubjects;
        }

        // porovnani
        HashMap<String, Subject> changedOld = new HashMap<String, Subject>();
        HashMap<String, Subject> changedNew = new HashMap<String, Subject>();
        //new

        for (Map.Entry<String, Subject> stary : masterSeznam.entrySet()){

            Subject staryPredmet = allOldSubjects.get(stary.getValue());
            Subject novyPredmet = allNewSubjects.get(stary.getKey());
            boolean zmena = false;

            if (novyPredmet == null || staryPredmet == null){
                zmena = true;
            } else {
                // polozku po polozce

                if (staryPredmet.getBuilding() != novyPredmet.getBuilding())     zmena = true;
                if (staryPredmet.getDateEndSubject() != novyPredmet.getDateEndSubject()) zmena= true;
                if (staryPredmet.getDateStartSubject() != novyPredmet.getDateStartSubject()) zmena= true;
                if (staryPredmet.isAct() != novyPredmet.isAct()) zmena= true;
                if (staryPredmet.getDay() != novyPredmet.getDay()) zmena= true;
                if (staryPredmet.getName() != novyPredmet.getName()) zmena= true;
                if (staryPredmet.getId() != novyPredmet.getId()) zmena= true;
                if (staryPredmet.getRoom() != novyPredmet.getRoom()) zmena= true;
                if (staryPredmet.getType() != novyPredmet.getType()) zmena= true;
                if (staryPredmet.getTimeStart() != novyPredmet.getTimeStart()) zmena= true;
                if (staryPredmet.getTimeEnd() != novyPredmet.getTimeEnd()) zmena= true;


            }

            if (zmena) {

                changedOld.put(stary.getKey(),staryPredmet);
                changedNew.put(stary.getKey(),novyPredmet);

                System.out.println("Zmenil se: " + stary.getKey());


            }

        }
            return new Diff(changedOld, changedNew);





    }



}
