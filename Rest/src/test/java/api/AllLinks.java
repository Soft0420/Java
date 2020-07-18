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

import models.PlanetModel;
import models.RootApi;

public class AllLinks {

	public String baseUrl = "https://swapi.dev/api/";

	@Test
	public void nameTest() throws ClientProtocolException, IOException {

		HttpClient client = HttpClientBuilder.create().build();
		
		HttpGet request = new HttpGet(baseUrl);
		request.addHeader("Accept", "application/json");

		HttpResponse response = client.execute(request);
		
		String allInOneLine = EntityUtils.toString(response.getEntity());
		
		System.out.println("------");
		System.out.println(allInOneLine);
		System.out.println("------");

		String[] arrayLinks = allInOneLine.split(",");

		for (int i = 0; i < arrayLinks.length; i++) {
			System.out.println(arrayLinks[i]);
		}
		int statusCode = response.getStatusLine().getStatusCode();
		
		System.out.println("************");
		Assert.assertTrue(statusCode == 200);
	}
}
