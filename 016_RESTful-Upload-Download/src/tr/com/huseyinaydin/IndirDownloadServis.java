package tr.com.huseyinaydin;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, RESTful Web Services.
* 
*/

@Path("/files")
public class IndirDownloadServis {

	private static final String TXT_ADRES = "C:\\Users\\Huseyin_Aydin\\Documents\\yuknenendosya.txt";
	// "C:\\Users\\Huseyin_Aydin\\Documents\\ornek.png";

	@GET
	@Path("/txt")
	@Produces("text/plain")
	// @Produces ("image/png")
	// @Produces ("application/pdf")
	// @Produces ("application/vnd.ms-excel")
	public Response txtIndir() {
		File file = new File(TXT_ADRES);
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition", "attachment; filename=\"inendosya.txt\"");
		return response.build();
	}

	private static final String PNG_ADRES = "C:\\Users\\Huseyin_Aydin\\Documents\\yuknenendosya.png";

	@GET
	@Path("/png")
	@Produces("image/png")
	public Response pngIndir() {
		File file = new File(PNG_ADRES);
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition", "attachment; filename=\"inendosya.png\"");
		return response.build();
	}
}