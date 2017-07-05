package cz.jcu.uai.javapract;

import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONObject;

import java.util.ArrayList;
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
    public ArrayList<Subject> parse(String json){
        //TODO: implement
        splitJSON(json);
        return listOfSubject;
    }

    public void splitJSON(String json){

//        JSONObject obj = new JSONObject(json);
        JSONArray vnejsiPole = new JSONArray(json);

        JSONObject vnejsiobj = (JSONObject) vnejsiPole.get(0);
        JSONArray rozvrhoveAkce = vnejsiobj.getJSONArray("rozvrhovaAkce");

        for(Object akce : rozvrhoveAkce){
            JSONObject jsonAkce = (JSONObject) akce;
//            if (jsonAkce.get(""))

            JSONObject hodinaObj = jsonAkce.getJSONObject("hodinaSkutOd");
            String hodina = hodinaObj.getString("value");

            System.out.println(jsonAkce.get("hodinaSkutOd"));


        }



//        String[] str = new String[5];
//        str[0] = obj.getJSONObject("nazev").toString();
//        str[1] = obj.getJSONObject("katedra").toString();
//        str[2] = obj.getJSONObject("budova").toString();
//        str[3] = obj.getJSONObject("mistnost").toString();
//        str[4] = obj.getJSONObject("nazev").toString();



    }


}
