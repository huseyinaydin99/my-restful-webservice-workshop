package tr.com.huseyinaydin;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Boot.
* 
*/

//http://localhost:8080/_012_RESTfulServer/ctofservice
@Path("/ctofservice")
public class CtoFService {

	// http://localhost:8080/_012_RESTfulServer/ctofservice
	@GET
	@Produces("application/xml")
	public String cevirCtoF() {
		Double fahrenheit;
		Double celsius = 10.50;
		fahrenheit = ((celsius * 9) / 5) + 32;
		String sonuc = "C to F Sonucu : \n" + fahrenheit;
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofsonuc>" + sonuc + "</ctofsonuc>"
				+ " </ctofservice>";
	}

	// http://localhost:8080/_012_RESTfulServer/ctofservice/40
	@GET
	@Path("{celsius}")
	@Produces("application/xml")
	public String cevirCtoFDetay1(@PathParam("celsius") Double celsius) {
		Double fahrenheit;
		// Double celsius = cel;
		fahrenheit = ((celsius * 9) / 5) + 32;
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<fahrenheit>" + fahrenheit + "</fahrenheit>"
				+ " </ctofservice>";
	}

	// http://localhost:8080/_012_RESTfulServer/ctofservice/10.4
	@GET
	@Path("{celsius}")
	@Produces("application/json")
	public Response cevirCtoFDetay2(@PathParam("celsius") Double celsius) {
		JSONObject jsonObject = new JSONObject();
		Double fahrenheit;
		// Double celsius = cel;
		fahrenheit = ((celsius * 9) / 5) + 32;
		jsonObject.put("F Value", fahrenheit);
		jsonObject.put("C Value", celsius);
		return Response.status(200).entity(jsonObject.toString()).build();
	}
}