package cz.jcu.uai.javapract;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

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

    public String fetchCurrentTimetableJson()
    {
        throw new NotImplementedException();

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
