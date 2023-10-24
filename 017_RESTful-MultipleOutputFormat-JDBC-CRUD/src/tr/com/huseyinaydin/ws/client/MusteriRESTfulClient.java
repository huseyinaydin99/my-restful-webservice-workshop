package tr.com.huseyinaydin.ws.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

//بسم الله الرحمن الرحيم

/**
 * 
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, RESTful Web Services.
 * 
 */

public class MusteriRESTfulClient {
	public static void main(String[] args) {
		try {
			Client client = Client.create();
			WebResource webResource = client
					.resource("http://localhost:8080/_017_RESTful-MultipleOutputFormat-JDBC-CRUD/rest/musteri/herkes");
			ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
			if (response.getStatus() == 200) {
				System.out.println(response.getEntity(String.class));
			} else {
				System.out.println("Hata oldu aha dayıya sor: HTTP(Hiper Text Transfer(aktarım) Protokolü) durum kodu: "
						+ response.getStatus());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}