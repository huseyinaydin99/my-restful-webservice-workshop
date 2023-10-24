package tr.com.huseyinaydin.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import tr.com.huseyinaydin.model.Personel;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, RESTful Web Services, Spring.
* 
*/

@XmlRootElement (name="personeller")
public class PersonelList implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<Personel> personeller = new ArrayList<Personel>();

	public List<Personel> getPersoneller() {
		return personeller;
	}

	public void setPersoneller(List<Personel> personeller) {
		this.personeller = personeller;
	}
}