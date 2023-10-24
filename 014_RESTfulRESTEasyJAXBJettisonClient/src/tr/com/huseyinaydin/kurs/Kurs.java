package tr.com.huseyinaydin.kurs;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Boot.
* 
*/

@XmlRootElement (name="kurs")
public class Kurs {
	
	private int egitimYili;
	private String dersinAdi;
	private int dersSuresi;
	private int dersFiyati;
	private String egitmenAdi;
	
	public Kurs() {
	}

	public Kurs(int egitimYili, String dersinAdi, int dersSuresi, int dersFiyati, String egitmenAdi) {
		this.egitimYili = egitimYili;
		this.dersinAdi = dersinAdi;
		this.dersSuresi = dersSuresi;
		this.dersFiyati = dersFiyati;
		this.egitmenAdi = egitmenAdi;
	}

	@XmlAttribute
	//@XmlElement
	public int getEgitimYili() {
		return egitimYili;
	}

	public void setEgitimYili(int egitimYili) {
		this.egitimYili = egitimYili;
	}

	@XmlElement
	public String getDersinAdi() {
		return dersinAdi;
	}

	public void setDersinAdi(String dersinAdi) {
		this.dersinAdi = dersinAdi;
	}

	@XmlElement
	public int getDersSuresi() {
		return dersSuresi;
	}

	public void setDersSuresi(int dersSuresi) {
		this.dersSuresi = dersSuresi;
	}

	@XmlElement
	public int getDersFiyati() {
		return dersFiyati;
	}

	public void setDersFiyati(int dersFiyati) {
		this.dersFiyati = dersFiyati;
	}

	@XmlElement
	public String getEgitmenAdi() {
		return egitmenAdi;
	}

	public void setEgitmenAdi(String egitmenAdi) {
		this.egitmenAdi = egitmenAdi;
	}	
}