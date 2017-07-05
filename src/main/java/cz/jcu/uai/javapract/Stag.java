package cz.jcu.uai.javapract;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;


/**
 * Created by Drml on 4.7.2017.
 */
public class Stag extends StagAbstract implements StagInterface {

    public Stag(ConfigurationParameters configurationParameters, Parser parser)
    {
        super(configurationParameters, parser);
    }

    public TimeTable fetchCurrentTimetable()
    {
        throw new NotImplementedException();
    }

    public String fetchCurrentTimetableJson() throws ClientProtocolException, IOException  //vrati string
    {
//        throw new NotImplementedException();



        HttpClient client = new DefaultHttpClient();
        HttpGet request = new HttpGet(apiUrl); // TODO: dodelat tam GET parametry ""
        HttpResponse response = client.execute(request);
        BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
        String line = "";
        while ((line = rd.readLine()) != null) {
            System.out.println(line);
        }

        return line;

        // NÁPOVĚDKA :)
        // Zdroj: https://www.javacodegeeks.com/2012/09/simple-rest-client-in-java.html

//    public static void main(String[] args) throws ClientProtocolException, IOException {
//        HttpClient client = new DefaultHttpClient();
//        HttpGet request = new HttpGet('http://restUrl');
//        HttpResponse response = client.execute(request);
//        BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
//        String line = '';
//        while ((line = rd.readLine()) != null) {
//            System.out.println(line);
//        }
//    }



    }
}
