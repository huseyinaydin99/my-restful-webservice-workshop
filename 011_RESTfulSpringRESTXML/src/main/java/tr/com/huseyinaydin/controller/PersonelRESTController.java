package tr.com.huseyinaydin.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tr.com.huseyinaydin.model.Personel;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, RESTful Web Services, Spring.
* 
*/

@RestController
public class PersonelRESTController {
	
	static Set<Personel> personeller;
	static {
		personeller = new HashSet<Personel>();	
		Personel personel = null;
		for (int i = 1; i < 10; i++) {
			personel = new Personel(i, 	"adi "+i,  "soyadi "+i,  "email "+i);
			personeller.add(personel);
		}
	}
	
	// http://localhost:8080/_011_RESTfulSpringRESTXML/personeller.xml	
	@RequestMapping (value ="/personeller.xml")
	public PersonelList getPersoneller1() {	
		PersonelList personeller = new PersonelList();
		Personel personel = null;
		for (int i = 1; i < 10; i++) {
			personel = new Personel(i, 	"adi "+i,  "soyadi "+i,  "email "+i);
			personeller.getPersoneller().add(personel);
		}
		return personeller;
	}
	
	// http://localhost:8080/_011_RESTfulSpringRESTXML/personeller.json
	@RequestMapping (value ="/personeller.json")
	public Set<Personel> getPersoneller2() {
		return personeller;
	}
	
	// http://localhost:8080/_011_RESTfulSpringRESTXML/personeller/3
	@RequestMapping(value = "/personeller/{id}", method = RequestMethod.GET, headers ="Accept=application/json", produces= "application/json")
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
}