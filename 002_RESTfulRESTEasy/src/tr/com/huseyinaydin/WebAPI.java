package tr.com.huseyinaydin;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, RESTful Web Services.
* 
*/

//http://localhost:8080/_002_RESTfulRESTEasy/rest/hello
@Path(value = "/hello")
public class WebAPI {
	
//http://localhost:8080/_001_RESTfulJersey/rest/hello
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String metot1() {
		System.out.println("metot1");
		return "Hi RESTful!";
	}
	
//http://localhost:8080/_002_RESTfulRESTEasy/rest/hello
	@GET
	@Produces("text/html")
	public Response metot2() {
		System.out.println("Method 2");		
	    String sonuc =	"<font face=verdana size=40>Method 2</font>";
		return Response.status(200).entity(sonuc).build();
	}
		
//http://localhost:8080/_002_RESTfulRESTEasy/rest/hello/query3
	@GET 
	@Path("/query3")
	@Produces("text/html")
	public Response metot3() {		
	    String sonuc =	"<font face=verdana size=60>Method 3</font>";
		return Response.status(200).entity(sonuc).build();
	}
	
//http://localhost:8080/_002_RESTfulRESTEasy/rest/hello/query4/{myParameter}
	@GET 
	@Path("/query4/{myParameter}")
	@Produces(MediaType.TEXT_XML)
	public Response metot4(@PathParam("myParameter") String myParameter) {		
	    String sonuc =	"<?xml version=\"1.0\"?><sayHello>"+ myParameter +" </sayHello>";
		return Response.status(200).entity(sonuc).build();
	}
	
//http://localhost:8080/_002_RESTfulRESTEasy/rest/hello/query5/{myParameter}
	@GET 
	@Path("/query5")
	@Produces(MediaType.TEXT_HTML)
	public Response metot5(@QueryParam("myParameter") String myParameter) {		
	    String sonuc =	"Hello, " + myParameter + " :) " ;
		return Response.ok(sonuc, MediaType.TEXT_HTML).build();
	}
}