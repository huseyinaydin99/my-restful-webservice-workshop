package tr.com.huseyinaydin;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Boot.
* 
*/

// http://localhost:8080/_005_XmlRootElement/rest/kayit

@Path("/kayit")
public class Merkez {
	
	// http://localhost:8080/_005_XmlRootElement/rest/kayit/bilgi/1
	
	@GET
	@Path("/bilgi/{id}")
	@Produces (MediaType.APPLICATION_XML)
	public Musteri getMusteriBilgi(@PathParam("id") int id) {
		Musteri musteri = new Musteri();
		musteri.setMusteritId(id);
		musteri.setMusteriAdi("Hüseyin");
		musteri.setMusteriSehir("Niğde");
		return musteri;	
	}	
}