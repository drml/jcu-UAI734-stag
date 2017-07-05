package cz.jcu.uai.javapract;


import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.SingleClientConnManager;
import org.apache.http.params.HttpConnectionParams;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;


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


        // Zacatek bloku ktery obchazi validaci SSL

//        SSLContext sslContext = SSLContext.getInstance("SSL");

// set up a TrustManager that trusts everything
//        try {
//            sslContext.init(null, new TrustManager[] { new X509TrustManager() {
//                public X509Certificate[] getAcceptedIssuers() {
//                    System.out.println("getAcceptedIssuers =============");
//                    return null;
//                }
//
//                public void checkClientTrusted(X509Certificate[] certs,
//                                               String authType) {
//                    System.out.println("checkClientTrusted =============");
//                }
//
//                public void checkServerTrusted(X509Certificate[] certs,
//                                               String authType) {
//                    System.out.println("checkServerTrusted =============");
//                }
//            } }, new SecureRandom());
//        } catch (KeyManagementException e) {
//            e.printStackTrace();
//        }
//
//        SSLSocketFactory sf = new SSLSocketFactory(sslContext);
//        Scheme httpsScheme = new Scheme("https", sf, 443);
//        SchemeRegistry schemeRegistry = new SchemeRegistry();
//        schemeRegistry.register(httpsScheme);
//
//// apache HttpClient version >4.2 should use BasicClientConnectionManager
//        ClientConnectionManager cm = new SingleClientConnManager(schemeRegistry);


        // Konec bloku, ktery obchazi validaci SSL


//        closab

        HttpClient client = new DefaultHttpClient();
        HttpGet request = new HttpGet(apiUrl); // TODO: dodelat tam GET parametry "&osCislo=B15254&semestr=ZS"
        HttpResponse response = client.execute(request);
        BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));

        StringBuilder stringBuilder = new StringBuilder();

        String line = "";
        while ((line = rd.readLine()) != null) {
            stringBuilder.append(line);
            System.out.println(line);
        }

        return stringBuilder.toString();

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
