package tr.com.huseyinaydin.kullanici;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//بسم الله الرحمن الرحيم

/**
 * 
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Boot.
 * 
 */

//   http://localhost:8080/_014_RESTfulRESTEasyJAXBJettisonClient/rest/kullanici-yonetim
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "kullanici-yonetim")
@Path("/kullanici-yonetim")
public class KullanciServis {
	@XmlElement(name = "kullanicilar")
	private String uri1 = "/kullanici-yonetim/kullanicilar";

	@XmlElement(name = "raporlar")
	private String uri2 = "/kullanici-yonetim/raporlar";

	public String getUri1() {
		return uri1;
	}

	public void setUri1(String uri1) {
		this.uri1 = uri1;
	}

	public String getUri2() {
		return uri2;
	}

	public void setUri2(String uri2) {
		this.uri2 = uri2;
	}

	@GET
	@Path("/xml") // ("/{xml : (?i)xml}") // Büyük küçük harf duyarlılığını yok eder.
	@Produces("application/xml;charset=utf-8")
	public KullanciServis servisBilgiXML() {
		return new KullanciServis();
	}

	@GET
	@Path("/json") // ("/{json : (?i)json}") // Büyük küçük harf duyarlılığını yok eder.
	@Produces("application/json;charset=utf-8")
	public KullanciServis servisBilgiJSON() {
		return new KullanciServis();
	}

//  http://localhost:8080/_014_RESTfulRESTEasyJAXBJettisonClient/rest/kullanici-yonetim/kullanicilar/1
	@GET
	@Path("/kullanicilar/{id}")
	@Produces("application/xml;charset=UTF-8")
	public Kullanici getKullaniciById(@PathParam("id") int id, @Context Request request) {
		if (request.getMethod().equals("GET")) {
			// request.getMethod().equals("POST"));
			Response.ResponseBuilder rb = request.evaluatePreconditions(new Date());
			if (rb != null) {
				throw new WebApplicationException(rb.build());
			}
		}
		Kullanici kullanici = new Kullanici();
		kullanici.setId(id);
		if (id == 1) {
			kullanici.setAdi("Hüseyin");
			kullanici.setSoyadi("Aydın");
		} else if (id == 2) {
			kullanici.setAdi("Hasan");
			kullanici.setSoyadi("Fefer");
		} else {
			kullanici.setAdi("Veli");
			kullanici.setSoyadi("Niğdeli");
		}
		kullanici.setUri("/kullanici-yonetim/kullanicilar/" + id);
		return kullanici;
	}

	// http://localhost:8080/_014_RESTEasy-JAXB-Jettison-Client/rest/kullanici-yonetim/kullanicilar
	/*
	 * <kullanici> <id>3</id> <adi>Hazım</adi> <soyadi>Tepeyran</soyadi> </kullanici>
	 */

	@POST
	@Path("/kullanicilar")
	@Consumes("application/xml;charset=UTF-8")
	public Response createKullanici(Kullanici kullanici,
			@DefaultValue("false") @QueryParam("allow-admin") boolean allowAdmin) throws URISyntaxException {
		System.out.println(kullanici.getAdi());
		System.out.println(kullanici.getSoyadi());
		return Response.status(201).contentLocation(new URI("/kullanici-yonetim/kullanicilar/3")).build();
	}

	@PUT
	// @Path("/kullanicilar/{id: [0-9]*}") //Sadece sayı girilmesini sağlar.
	@Path("/kullanicilar/{id}")
	@Consumes("application/xml;charset=UTF-8")
	@Produces("application/xml;charset=UTF-8")
	public Kullanici updateKullanici(@PathParam("id") int id, Kullanici kullanici) throws URISyntaxException {
		kullanici.setId(id);
		kullanici.setAdi(kullanici.getAdi() + " güncellendi");
		return kullanici;
	}

	@DELETE
	@Path("/kullanicilar/{id}")
	public Response deleteKullanici(@PathParam("id") int id) throws URISyntaxException {
		return Response.status(200).build();
	}
}