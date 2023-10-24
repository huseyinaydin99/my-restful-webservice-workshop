package tr.com.huseyinaydin.kullanici;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, RESTful Web Services.
* 
*/

@XmlAccessorType (XmlAccessType.NONE)
@XmlRootElement (name ="kullanicilar")
public class Kullancilar {
	
	@XmlElement (name="kullanicilar")
	private ArrayList<Kullanici> kullanicilar;

	public ArrayList<Kullanici> getKullanicilar() {
		return kullanicilar;
	}

	public void setKullanicilar(ArrayList<Kullanici> kullanicilar) {
		this.kullanicilar = kullanicilar;
	}
}