package cz.jcu.uai.javapract;

import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.json.*;


/**
 * Created by Drml on 4.7.2017.
 */
public class Parser {

    private Subject subject;
    private ArrayList<Subject> listOfSubject;


    /**
     * Parses string into TimeTable
     *
     * @param json
     * @return
     */
    public TimeTable parse(String json){
        //TODO: implement
        TimeTable rozvrh = new TimeTable();
        rozvrh.CreateTimeTable(new Date(),splitJSON(json));
        return rozvrh;
    }

    public ArrayList<Subject> splitJSON(String json){

        ArrayList<Subject> listOfSubject = new ArrayList<>();

        JSONArray vnejsiPole = new JSONArray(json);

        JSONObject vnejsiobj = (JSONObject) vnejsiPole.get(0);
        JSONArray rozvrhoveAkce = vnejsiobj.getJSONArray("rozvrhovaAkce");

        for(Object akce : rozvrhoveAkce){
            JSONObject jsonAkce = (JSONObject) akce;
            if (jsonAkce.isNull("roakIdno"))
                continue;
            else{
                JSONObject hodinaObj = jsonAkce.getJSONObject("hodinaSkutOd");
                String hodinaStart = hodinaObj.getString("value");
                JSONObject hodinaObj2 = jsonAkce.getJSONObject("hodinaSkutDo");
                String hodinaEnd = hodinaObj2.getString("value");


                String datumStart = null;
                String datumEnd = null;

                if (!jsonAkce.isNull("datumOd") || !jsonAkce.isNull("datumDo")) {
                    JSONObject datumObj = jsonAkce.getJSONObject("datumOd");
                    datumStart = datumObj.getString("value");
                    JSONObject datumObj2 = jsonAkce.getJSONObject("datumDo");
                    datumEnd = datumObj2.getString("value");
                }

                int day;
                switch(jsonAkce.getString("denZkr")) {
                    case "Po":
                        day = Calendar.MONDAY;
                        break;
                    case "Ut":
                        day = Calendar.TUESDAY;
                        break;
                    case "St":
                        day = Calendar.WEDNESDAY;
                        break;
                    case "Ct":
                        day = Calendar.THURSDAY;
                        break;
                    case "Pa":
                        day = Calendar.FRIDAY;
                        break;
                    default:
                        day = Calendar.SUNDAY;  //Error
                }

                //subject.ResetSubject();
                Boolean konase = false;
                if (jsonAkce.isNull("nekonaSe"))
                    konase = true;

                subject = new Subject(
                    jsonAkce.getString("typAkceZkr"),
                    jsonAkce.getString("nazev"),
                    jsonAkce.getInt("predmet"),
                    jsonAkce.getString("katedra"),
                    hodinaStart,
                    hodinaEnd,
                    day,
                    jsonAkce.getString("budova"),
                    jsonAkce.getString("mistnost"),
                    datumStart,
                    datumEnd,
                    konase
                );

                    listOfSubject.add(subject);
            }

        }

        return listOfSubject;

    }


}
