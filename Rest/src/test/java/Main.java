import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class Main {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		
		String url ="https://swapi.dev/api/starships/10/";

	    HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);
        request.addHeader("Accept", "application/json");
        HttpResponse response = client.execute(request);
        
        BufferedReader rd = new BufferedReader (
        		new InputStreamReader(response.getEntity().getContent()));
        
        int responseCode = response.getStatusLine().getStatusCode();
        
        String line = "";
        
        while ((line = rd.readLine()) != null) {
          System.out.println(line);
        }

	}

}
