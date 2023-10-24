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
* @category Java, RESTful Web Services.
* 
*/

// http://localhost:8080/_012_RESTfulServer/ftocservice
@Path("/ftocservice")
public class FtoCService {

	// http://localhost:8080/_012_RESTfulServer/ftocservice
	@GET
	@Produces("application/json")
	public Response cevirFtoC() {
		Double fahrenheit = 10.50;
		Double celsius;
		celsius = (fahrenheit - 32) * 5 / 9;
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("F", fahrenheit);
		jsonObject.put("C", celsius);
		return Response.status(200).entity(jsonObject.toString()).build();
	}

	// http://localhost:8080/_012_RESTfulServer/ftocservice/10.4
	@GET
	@Path("{fahrenheit}")
	@Produces("application/json")
	public Response cevirFtoCDetay2(@PathParam("fahrenheit") Double fahrenheit) {
		JSONObject jsonObject = new JSONObject();
		Double celsius;
		celsius = (fahrenheit - 32) * 5 / 9;
		jsonObject.put("F", fahrenheit);
		jsonObject.put("C", celsius);
		return Response.status(200).entity(jsonObject.toString()).build();
	}

	// http://localhost:8080/_012_RESTfulServer/ftocservice/40
	@GET
	@Path("{fahrenheit}")
	@Produces("application/xml")
	public String cevirFtoCDetay1(@PathParam("fahrenheit") Double fahrenheit) {
		Double celsius = (fahrenheit - 32) * 5 / 9;
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<fahrenheit>" + fahrenheit + "</fahrenheit>"
				+ " </ctofservice>";
	}
}