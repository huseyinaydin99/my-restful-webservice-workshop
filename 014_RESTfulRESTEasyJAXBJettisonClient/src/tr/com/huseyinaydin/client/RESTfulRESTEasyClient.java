package tr.com.huseyinaydin.client;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import tr.com.huseyinaydin.ogrenci.Ogrenci;

//بسم الله الرحمن الرحيم

/**
 * 
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Boot.
 * 
 */

public class RESTfulRESTEasyClient {

	public static void main(String[] args) {
		String ogrenci1 = "{ \"ogrenci\":{ \"id\": 1,     \"adi\": \"Hüseyin\",     \"soyadi\":\"Aydın\",      \"yasi\":29}}";
		String ogrenci2 = "{ \"ogrenci\":{ \"id\": 2,     \"adi\": \"Hasan\",     \"soyadi\":\"Fefer\",      \"yasi\":33}}";
		Ogrenci ogrenci3 = new Ogrenci(3, "Yasin", "Aydın", 30);
		try {
			ResteasyClient client = new ResteasyClientBuilder().build();
			ResteasyWebTarget target = client
					.target("http://localhost:8080/_014_RESTfulRESTEasyJAXBJettisonClient/rest/ogrenci/gonder");
			Response response = target.request().post(Entity.entity(ogrenci1, "application/json;charset=utF-8"));
			if (response.getStatus() != 200) {
				throw new RuntimeException("Hata! Gelen HTTP kodu: " + response.getStatus());
			}
			System.out.println(response.readEntity(String.class));
			System.out.println("-------------------------------------");
			response = target.request().post(Entity.entity(ogrenci2, "application/json;charset=utF-8"));
			if (response.getStatus() != 200) {
				throw new RuntimeException("Hata! Gelen HTTP kodu: " + response.getStatus());
			}
			System.out.println(response.readEntity(String.class));
			System.out.println("-------------------------------------");
			response = target.request().post(Entity.entity(ogrenci3, "application/json;charset=utF-8"));
			if (response.getStatus() != 200) {
				throw new RuntimeException("Hata! Gelen HTTP kodu: " + response.getStatus());
			}
			System.out.println(response.readEntity(String.class));
			System.out.println("-------------------------------------");
			response.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}