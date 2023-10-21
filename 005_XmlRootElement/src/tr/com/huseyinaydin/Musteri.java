package tr.com.huseyinaydin;

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

@XmlRootElement(name = "musteri")
public class Musteri {

	int musteritId;
	String musteriAdi;
	String musteriSehir;

	@XmlElement
	public int getMusteritId() {
		return musteritId;
	}

	public void setMusteritId(int musteritId) {
		this.musteritId = musteritId;
	}

	@XmlElement
	public String getMusteriAdi() {
		return musteriAdi;
	}

	public void setMusteriAdi(String musteriAdi) {
		this.musteriAdi = musteriAdi;
	}

	@XmlElement
	public String getMusteriSehir() {
		return musteriSehir;
	}

	public void setMusteriSehir(String musteriSehir) {
		this.musteriSehir = musteriSehir;
	}
}