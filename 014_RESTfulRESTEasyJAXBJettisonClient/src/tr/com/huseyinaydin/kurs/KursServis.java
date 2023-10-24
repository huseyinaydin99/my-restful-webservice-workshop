package tr.com.huseyinaydin.kurs;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.jboss.resteasy.annotations.providers.jaxb.json.BadgerFish;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, RESTful Web Services.
* 
*/

//http://localhost:8080/_014_RESTfulRESTEasyJAXBJettisonClient/rest/kurs
@Path ("/kurs")
public class KursServis {

	//http://localhost:8080/_014_RESTfulRESTEasyJAXBJettisonClient/rest/kurs/olusturjsonyap
	//@BadgerFish
	@GET
	@Path ("/olusturjsonyap")
	@Produces ("application/json;charset=utF-8") 
	public List<Kurs> alKursBilgi1() {
		List<Kurs> kurslar = new ArrayList<Kurs>();
		Kurs kurs = null;
		for (int i = 1; i < 10; i++) {
			kurs = new Kurs(2006+i, "dersinAdi"+i, 25+i, 50*i, "egitmenAdi"+i);
			kurslar.add(kurs);	
		}	
		return kurslar;
	}
	
	//http://localhost:8080/_014_RESTfulRESTEasyJAXBJettisonClient/rest/kurs/olusturxmlyap
	//@BadgerFish
	@GET
	@Path ("/olusturxmlyap")
	@Produces ("application/xml;charset=utF-8") 
	public List<Kurs> alKursBilgi2() {
		List<Kurs> kurslar = new ArrayList<Kurs>();
		Kurs kurs = null;
		for (int i = 1; i < 10; i++) {
			kurs = new Kurs(2006+i, "dersinAdi"+i, 25+i, 50*i, "egitmenAdi"+i);
			kurslar.add(kurs);	
		}	
		return kurslar;
	}	
}