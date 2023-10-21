package tr.com.huseyinaydin;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.PathSegment;
import javax.ws.rs.core.Response;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Boot.
* 
*/

//  http://localhost:8080/_003_RESTful-Annotations/rest/kullanici
@Path(value="/kullanici")
public class WebAPI {
//  http://localhost:8080/_003_RESTful-Annotations/rest/kullanici
	@GET
	public Response selamVer1() {
		return Response.status(200).entity("Selamun Aleyküm Dayılar | Aha dayıya sor.").build();
	}	
	
//  http://localhost:8080/_003_RESTful-Annotations/rest/kullanici/selamla
	@GET
	@Path("/selamla")
	public Response selamVer2() {
		return Response.status(200).entity("Selam knka.").build();	
	}
			
//  http://localhost:8080/_003_RESTful-Annotations/rest/kullanici/selamla/Murat
	@GET
	@Path("/selamla/{adi}")
	public Response selamVer3(@PathParam("adi") String adi) {
		return Response.status(200).entity("Merhabalar cnm "+ adi).build();	
	}
				
//  http://localhost:8080/_003_RESTful-Annotations/rest/kullanici/01/Adana
	@GET
	@Path("/{plakaNumarasi}/{sehirAdi}")
	@Produces("text/html")
	public Response getSehirBilgisi(
			@PathParam("plakaNumarasi") String plakaNumarasi, 
			@PathParam("sehirAdi") String sehirAdi) {
		String sonuc = "Detaylar: " + sehirAdi + " - " + plakaNumarasi;	
		return Response.status(200).entity(sonuc).build();	
	}
	
//  http://localhost:8080/_003_RESTful-Annotations/rest/kullanici/regex/Murat
	@GET
	@Path("/regex/{adi :[a-zA-Z][a-zA-Z_0-9]+ }")
	public Response selamVerRegex(@PathParam("adi") String adi) {
		return Response.status(200).entity("Kurallı merhabalar(Regex(düzenli ifadeler değerler doğru formatta mı?)) "+ adi).build();	
	}
			
//  http://localhost:8080/_003_RESTful-Annotations/rest/kullanici/1/Murat
	@GET
	@Path("/1/{adi}")
	public Response selamBilgisiniAl(@PathParam("adi") String adi) {
		return Response.status(200).entity("Selamlar "+ adi).build();	
	}
	
//  http://localhost:8080/_003_RESTful-Annotations/rest/kullanici/2/Murat/25
	@GET
	@Path("/2/{adi}/{yasi}")
	public Response selamBilgisiniAl(@PathParam("adi") String adi,   @PathParam("yasi") String yasi  ) {
		return Response.status(200).entity("ADI: "+ adi + " YAS: "+  yasi).build();		
	}

//  http://localhost:8080/_003_RESTful-Annotations/rest/kullanici;adi=NazÄ±m;ulke=TÃ¼rkiye
	@GET
	@Produces("text/html"+";charset=utf-8")
	public Response personelBilgisiniAl(
			@MatrixParam("adi") String adi,   
			@MatrixParam("ulke") String ulke  ) {
		return Response.status(200).entity("ADI: "+ adi + " ÃœLKE: "+  ulke).build();	
	}	
	
//  http://localhost:8080/_003_RESTful-Annotations/rest/kullanici/personel/detay;adi=NazÄ±m;meslek=YazÄ±lÄ±mcÄ±;tecrube=7
	@GET
	@Path("/personel/{detay}")
	@Produces("text/plain"+";charset=utf-8")
	public Response getPersonelBilgi(@PathParam("detay") PathSegment detay) {
		String personel = "Personel : ";
		MultivaluedMap<String, String> matrix = detay.getMatrixParameters();
		for (String key : matrix.keySet()) {
			personel +=  key + matrix.get(key) + " "; 
		}
		personel += " "; 
		return Response.status(200).entity(personel).build();
	}		
}