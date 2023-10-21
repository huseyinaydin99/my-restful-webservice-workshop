package tr.com.huseyinaydin.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import tr.com.huseyinaydin.model.Kullanici;

//بسم الله الرحمن الرحيم

/**
 * 
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Boot.
 * 
 */

public class Merkez {

	public static void main(String[] args) {
		int idDegeri = 15;
		try {
			URL url = new URL("http://localhost:8080/_006_JAXB/kullanici/detay/" + idDegeri);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Accept", "application/xml");

			if (connection.getResponseCode() != 200) {
				throw new RuntimeException("Gelen HTTP kodu: " + connection.getResponseCode());
			}

			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String sonuc = bufferedReader.readLine();
			System.out.println(sonuc);
			connection.disconnect();

			JAXBContext jaxbContext = JAXBContext.newInstance(Kullanici.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Kullanici kullanici = (Kullanici) jaxbUnmarshaller.unmarshal(new StringReader(sonuc));

			System.out.println(kullanici.getKullaniciId());
			System.out.println(kullanici.getKullaniciAdi());
			System.out.println(kullanici.getKullaniciSoyadi());

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}