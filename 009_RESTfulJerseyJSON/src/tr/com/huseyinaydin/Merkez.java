package tr.com.huseyinaydin;
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
*/

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Boot.
* 
*/

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Boot.
* 
*/

public class Merkez {

		public static void main(String[] args) {
			int idDegeri = 55;
			try {
				Client client = Client.create();
				WebResource resource = client.resource("http://localhost:8080/_009_RESTfulJerseyJSON/rest/kayit/bilgi/"+idDegeri);
				ClientResponse response = resource.accept("application/json"+";charset=utf-8").get(ClientResponse.class);
						
				if (response.getStatus() != 200) {
					throw new RuntimeException("Hata oluştu! ");
				}else{
					String sonuc = response.getEntity(String.class);
					System.out.println(sonuc);
				}	
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			/*
			int idDegeri = 15;
			
			try {
				
				URL url = new URL("http://localhost:8080/_009_RESTfulJerseyJSON/rest/kayit/bilgi/"+idDegeri);
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				connection.setRequestMethod("GET");
				connection.setRequestProperty("Accept", "application/json"+";charset=utf-8");
				
				if (connection.getResponseCode() != 200) {
					throw new RuntimeException("Gelen HTTP Code: " + connection.getResponseCode());
				}
				
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				String sonuc = bufferedReader.readLine();
				System.out.println(sonuc);
				connection.disconnect();
		
				
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} 
			*/
		}
}