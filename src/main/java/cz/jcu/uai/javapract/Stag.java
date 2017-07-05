package cz.jcu.uai.javapract;


import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.util.EntityUtils;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;


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

    public String fetchCurrentTimetableJson() throws IOException, KeyStoreException, NoSuchAlgorithmException, KeyManagementException, URISyntaxException  //vrati string
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

        SSLContextBuilder builder = new SSLContextBuilder();
        builder.loadTrustMaterial(null, new TrustSelfSignedStrategy());
        SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
                builder.build());
        CloseableHttpClient httpclient = HttpClients.custom().setSSLSocketFactory(
                sslsf).build();

        URIBuilder urlBuilder = null;
        try {
            urlBuilder = new URIBuilder(apiUrl);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        urlBuilder.setParameter("osCislo", studentId).setParameter("semestr", semester);

        HttpGet httpGet = new HttpGet(urlBuilder.build());

        CloseableHttpResponse response = httpclient.execute(httpGet);

        StringBuilder stringBuilder = new StringBuilder();

        try {
            System.out.println(response.getStatusLine());
            HttpEntity entity = response.getEntity();
            BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));

            String line = "";
            while ((line = rd.readLine()) != null) {
                stringBuilder.append(line);
            }

        }
        finally {
            response.close();
        }

        return stringBuilder.toString();



    }
}
