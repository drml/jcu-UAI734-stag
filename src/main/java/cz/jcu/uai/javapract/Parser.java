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
    public TimeTable parse(String json){
        //TODO: implement
        splitJSON(json);
        return null;
    }

    private void splitJSON(String json){
//        String[] str = json.split(":");
//        String[] pushstr;
//        for (int i = 0; i<12 ; i++){
//            pushstr =
//        }

        JSONObject obj = new JSONObject(json);
        JSONArray arr = obj.getJSONArray("rozvrhovaAkce");
    }


}
