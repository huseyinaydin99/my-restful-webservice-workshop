package tr.com.huseyinaydin;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, RESTful Web Services.
* 
*/

// http:localhost:8080/_004_RESTfulFrom/rest/uye/giris

@Path("/uye")
public class MemberService {

	@POST
	@Path("/giris")
	@Produces("text/html" + ";charset=utf-8")
	public Response girisYap(@FormParam("kullaniciAdi") String adi, @FormParam("kullaniciParola") String parola) {
		String sonuc = "<hr> Kişi bilgileri : <font face='verdana' size='3' ><hr> <u>" + adi + "</u> <hr> <u>"
				+ parola + "</u>   </font>";
		return Response.status(200).entity("Başarılı : " + sonuc).build();
	}

	// http:localhost:8080/_004_RESTfulFrom/rest/uye/ekle
	@POST
	@Path("/ekle")
	@Produces("text/html" + ";charset=utf-8")
	public Response eklemeYap(@FormParam("personelAdi") String adi, @FormParam("personelUlke") String ulke) {
		String sonuc = "<hr> Eklenen Kişi bilgileri : <font face='verdana' size='3' ><hr> <u>" + adi + "</u> <hr> <u>"
				+ ulke + "</u>   </font>";
		return Response.status(200).entity("Başarılı : " + sonuc).build();
	}
}