package tr.com.huseyinaydin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

//بسم الله الرحمن الرحيم

/**
 * 
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, RESTful Web Services.
 * 
 */

//    http://localhost:8080/_016_RESTful-Upload-Download/rest/file
@Path("/file")
public class YukleUploadServis {

//  http://localhost:8080/_016_RESTful-Upload-Download/rest/file/upload	
	@POST
	@Path("/upload")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public Response yuklemeYap(@FormDataParam("file") InputStream uploadInputStream,
			@FormDataParam("file") FormDataContentDisposition dosyaDetayi) {
		String yuklemeAdresi = "C:\\Users\\Huseyin_Aydin\\Documents\\yuknenendosya.txt";
		System.out.println(dosyaDetayi.getFileName());
		// "C:\\Users\\Huseyin_Aydin\\Documents\\";
		kaydet(uploadInputStream, yuklemeAdresi);
		String sonuc = "Basarili : " + yuklemeAdresi;
		return Response.status(200).entity(sonuc).build();
	}

	private void kaydet(InputStream uploadInputStream, String yuklemeAdresi) {
		try {
			OutputStream out = new FileOutputStream(new File(yuklemeAdresi));
			int okuRead = 0;
			byte[] bytes = new byte[1024];
			out = new FileOutputStream(new File(yuklemeAdresi));
			while ((okuRead = uploadInputStream.read(bytes)) != -1) {
				out.write(bytes, 0, okuRead);
			}
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}