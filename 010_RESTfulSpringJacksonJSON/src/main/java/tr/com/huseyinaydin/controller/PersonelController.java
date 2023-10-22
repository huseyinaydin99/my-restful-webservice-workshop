package tr.com.huseyinaydin.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import tr.com.huseyinaydin.model.Personel;

//بسم الله الرحمن الرحيم

/**
 * 
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Boot.
 * 
 */

// http://localhost:8080/_010_RESTfulSpringJacksonJSON/personel
@Controller
@RequestMapping("/personel")
public class PersonelController {

	static Set<Personel> personeller;
	static {
		personeller = new HashSet<Personel>();
		Personel personel = null;
		for (int i = 1; i < 10; i++) {
			personel = new Personel(i, "personel " + i);
			personeller.add(personel);
		}
	}

	// http://localhost:8080/_010_RESTfulSpringJacksonJSON/personel/listele
	@RequestMapping(value = "/listele", method = RequestMethod.GET, headers = "Accept=application/json", produces = "application/json")
	@ResponseBody
	public Set<Personel> getPersonelListesi() {
		return personeller;
	}

	// http://localhost:8080/_010_RESTfulSpringJacksonJSON/personel/listele/3
	@RequestMapping(value = "/listele/{id}", method = RequestMethod.GET, headers = "Accept=application/json", produces = "application/json")
	@ResponseBody
	public Personel getPersonelListesiId(@PathVariable("id") int id) {
		Iterator<Personel> kisi = personeller.iterator();
		while (kisi.hasNext()) {
			Personel personelNesnesi = (Personel) kisi.next();
			if (personelNesnesi.getId() == id) {
				return personelNesnesi;
			}
		}
		return null;
	}

	// http://localhost:8080/_010_RESTfulSpringJacksonJSON/personel/listele/html
	@RequestMapping(value = "/listele/html", method = RequestMethod.GET, headers = "Accept=text/html", produces = "text/html")
	@ResponseBody
	public String getPersonelListesiHtml() {
		String htmlkodlari = "<html><body> <table border=2>";
		Iterator<Personel> kisi = personeller.iterator();
		while (kisi.hasNext()) {
			Personel personelNesnesi = (Personel) kisi.next();
			htmlkodlari += "<tr> <td>" + personelNesnesi.getId() + "</td>  <td>" + personelNesnesi.getAdi()
					+ "</td>  </tr>";
			/*
			 * if (personelNesnesi.getId() == id) { return personelNesnesi; }
			 */
		}
		htmlkodlari += "</table> </body> </html>";
		return htmlkodlari;
	}

	// http://localhost:8080/_010_RESTfulSpringJacksonJSON/personel/listele/3

	@RequestMapping(value = "/listele/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json", produces = "application/json")
	@ResponseBody
	public boolean getPersonelListesiSilmeId(@PathVariable("id") int id) {
		Iterator<Personel> kisi = personeller.iterator();
		while (kisi.hasNext()) {
			Personel personelNesnesi = (Personel) kisi.next();
			if (personelNesnesi.getId() == id) {
				kisi.remove();
				System.out.println("Silindi..." + id);
				return true;
			}

		}
		System.out.println("Silinemedi..." + id);
		return false;
	}

	// http:localhost:8080/_010_RESTfulSpringJacksonJSON/personel/listele/
	@RequestMapping(value = "/listele", method = RequestMethod.POST, headers = "Accept=application/json", consumes = "application/json")
	@ResponseBody
	public boolean getPersonelListesiEkleme(@RequestBody Personel personel) {
		return personeller.add(personel);
	}

	// http://localhost:8080/_010_RESTfulSpringJacksonJSON/personel/listele/10
	@RequestMapping(value = "/listele/{id}", method = RequestMethod.PUT, headers = "Accept=application/json", produces = "application/json", consumes = "application/json")
	@ResponseBody
	public Personel getPersonelListesiDuzenlemeId(@RequestBody Personel personelJsonGelen, @PathVariable("id") int id) {
		Iterator<Personel> kisi = personeller.iterator();
		while (kisi.hasNext()) {
			Personel personelNesnesi = (Personel) kisi.next();
			if (personelNesnesi.getId() == id) {
				personelNesnesi.setId(personelJsonGelen.getId());
				personelNesnesi.setAdi(personelJsonGelen.getAdi());
				System.out.println("Düzenlendi..." + id);
				return personelNesnesi;
			}
		}
		System.out.println("Düzenlenemedi..." + id);
		return null;
	}
}