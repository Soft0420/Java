package api;

import java.io.BufferedReader;
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
import models.PlanetModel;

public class Planet {

	public String baseUrl = "https://swapi.dev/api/";
	
	@Test
	public void nameTest() throws ClientProtocolException, IOException {

		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(baseUrl + "planets/9/");
		request.addHeader("Accept", "application/json");
		HttpResponse response = client.execute(request);

		InputStreamReader streamReader = new InputStreamReader(response.getEntity().getContent());
		PlanetModel planet = new Gson().fromJson(streamReader, PlanetModel.class);

		int statusCode = response.getStatusLine().getStatusCode();
		Assert.assertTrue(statusCode == 200);

		Assert.assertEquals(planet.getName(), "Alderaan");
        Assert.assertEquals(planet.getDiameter(), "12500");
        Assert.assertEquals(planet.getPopulation(), "2000000000");
        System.err.println("Population of the planet is: " + planet.getPopulation());
        
        System.out.println("************");
        System.out.println(planet);
	}
}
