package cz.jcu.uai.javapract;

import java.sql.Time;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Trida porovnanva rozdily mezi dvema rozvrhy
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


        // vsechny klice
        HashSet<String> allKeys = new HashSet<String>();
        allKeys.addAll(allOldSubjects.keySet());
        allKeys.addAll(allNewSubjects.keySet());


        // porovnani
        HashMap<String, Subject> changedOld = new HashMap<String, Subject>();
        HashMap<String, Subject> changedNew = new HashMap<String, Subject>();



        for (String key : allKeys){

            Subject staryPredmet = allOldSubjects.get(key);
            Subject novyPredmet = allNewSubjects.get(key);
            boolean zmena = false;


            if (novyPredmet == null || staryPredmet == null){
                zmena = true;
            } else {
                // polozku po polozce

                if (!staryPredmet.getBuilding().equals(novyPredmet.getBuilding()))     zmena = true;
                if (!staryPredmet.getDateEndSubject().equals(novyPredmet.getDateEndSubject())) zmena= true;
                if (!staryPredmet.getDateStartSubject().equals(novyPredmet.getDateStartSubject())) zmena= true;
                if (staryPredmet.isAct() != novyPredmet.isAct()) zmena= true;
                if (staryPredmet.getDay() != novyPredmet.getDay()) zmena= true;
                if (!staryPredmet.getName().equals(novyPredmet.getName())) zmena= true;
                if (!staryPredmet.getId().equals(novyPredmet.getId())) zmena= true;
                if (!staryPredmet.getRoom().equals(novyPredmet.getRoom())) zmena= true;
                if (staryPredmet.getType() != novyPredmet.getType()) zmena= true;
                if (!staryPredmet.getTimeStart().equals(novyPredmet.getTimeStart())) zmena= true;
                if (!staryPredmet.getTimeEnd().equals(novyPredmet.getTimeEnd())) zmena= true;


            }

            if (zmena) {

                changedOld.put(key,staryPredmet);
                changedNew.put(key,novyPredmet);

                System.out.println("Zmenil se: " + key);

            }

        }
        if(changedOld.size()==0 && changedNew.size()==0){
            return null;

        }else {
            return new Diff(changedOld, changedNew);
        }

    }



}
