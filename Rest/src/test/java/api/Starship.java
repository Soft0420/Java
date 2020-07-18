package api;

import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.Gson;

import models.StarshipModel;
import okhttp3.internal.http2.Header;

public class Starship {

	public int shipId = 9;
	public String baseUrl = "https://swapi.dev/api/";
	public String starship = String.format("starships/%d/", shipId);  
	
	@Test
	public void nameTest() throws ClientProtocolException, IOException {

		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(baseUrl + starship);
		request.addHeader("Accept", "application/json");
		HttpResponse response = client.execute(request);

		InputStreamReader streamReder = new InputStreamReader(response.getEntity().getContent());
		StarshipModel starship = new Gson().fromJson(streamReder, StarshipModel.class);

		int statusCode = response.getStatusLine().getStatusCode();
		Assert.assertTrue(statusCode == 200);
        Assert.assertEquals(starship.getName(), "Death Star");

        System.out.println(">>>>>");
        System.out.println(starship.getCostInCredits());
        System.out.println("<<<<<");
          
        Assert.assertTrue(starship.getCostInCredits() == "12");
        
        System.out.println("************");
        System.out.println(starship);
	}
}

