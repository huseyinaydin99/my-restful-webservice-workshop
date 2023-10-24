package tr.com.huseyinaydin.ws;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, RESTful Web Services.
* 
*/

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import tr.com.huseyinaydin.dao.impl.MusteriDAOImpl;
import tr.com.huseyinaydin.model.pojo.entity.bean.Musteri;

//   http://localhost:8080/_017_RESTful-MultipleOutputFormat-JDBC-CRUD/rest/musteri
@Path("/musteri")
public class MusteriRESTfulService {

//  http://localhost:8080/_017_RESTful-MultipleOutputFormat-JDBC-CRUD/rest/musteri/herkes	
	@GET
	@Path("/herkes")
//	@Produces ("application/xml,  application/json ; charset=utf-8")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON + ";charset=utf-8" })
	public List<Musteri> musterileriGetir() {
		/**List<Musteri> musteriler = new ArrayList<Musteri>();
		Musteri musteri = null;

		for (int i = 1; i < 10; i++) {
			musteri = new Musteri(i, i * i, "musteriAdi" + i, "musteriSoyadi" + i);
			musteri = new Musteri();
			musteri.setMusteriId(i);
			musteri.setMusteriNo(i * i);
			musteri.setMusteriAdi("musteriAdi" + i);
			musteri.setMusteriSoyadi("musteriSoyadi" + i);
			musteriler.add(musteri);
		}
		return musteriler;*/

		MusteriDAOImpl nesne = new MusteriDAOImpl();
		return nesne.veriOku();
	}

//  http://localhost:8080/_017_RESTful-MultipleOutputFormat-JDBC-CRUD/rest/musteri/2	
	@GET
	@Path("/{musteriId}")
//	@Produces ("application/xml,  application/json ; charset=utf-8")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON + ";charset=utf-8" })
	public Musteri musteriGetirById(@PathParam("musteriId") int musteriId) {

		/*Musteri musteri = new Musteri();
		musteri.setMusteriId(musteriId);
		musteri.setMusteriNo(musteriId * musteriId);
		musteri.setMusteriAdi("musteriAdi" + musteriId);
		musteri.setMusteriSoyadi("musteriSoyadi" + musteriId);
		return musteri;*/

		MusteriDAOImpl nesne = new MusteriDAOImpl();
		return nesne.veriOku(musteriId);
	}

//  http://localhost:8080/_017_RESTful-MultipleOutputFormat-JDBC-CRUD/rest/musteri
	@POST
	@Path("/")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON + ";charset=utf-8" })
	public Response musteriEkle(Musteri musteri) {
		MusteriDAOImpl nesne = new MusteriDAOImpl();
		boolean eklemeDurumu = nesne.veriEkle(musteri);
		if (eklemeDurumu == false)
			return Response.status(201).build();
		else
			return Response.status(204).build();
	}

//  http://localhost:8080/_017_RESTful-MultipleOutputFormat-JDBC-CRUD/rest/musteri/4
	@PUT
	@Path("/{musteriId}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON + ";charset=utf-8" })
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON + ";charset=utf-8" })
	public Musteri musteriDuzenle(@PathParam("musteriId") int musteriId, Musteri musteri) {
		MusteriDAOImpl nesne = new MusteriDAOImpl();
		boolean duzenlemeDurumu = nesne.veriDuzenle(musteri, musteriId);
		if (duzenlemeDurumu == true)
			return musteri;
		else
			return null;
	}

//  http://localhost:8080/_017_RESTful-MultipleOutputFormat-JDBC-CRUD/rest/musteri
	@DELETE
	@Path("/{musteriId}")
	public Response musteriSil(@PathParam("musteriId") int musteriId) {
		MusteriDAOImpl nesne = new MusteriDAOImpl();
		boolean silmeDurumu = nesne.veriSilme(musteriId);
		if (silmeDurumu == false)
			return Response.status(200).build();
		else
			return Response.status(204).build();
	}
}