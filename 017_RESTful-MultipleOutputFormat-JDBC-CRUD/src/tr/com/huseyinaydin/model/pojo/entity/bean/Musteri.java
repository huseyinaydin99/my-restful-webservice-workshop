package tr.com.huseyinaydin.model.pojo.entity.bean;

import javax.xml.bind.annotation.XmlAttribute;
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

@XmlRootElement (name ="musteri")
public class Musteri {

	private int musteriId;
	private int musteriNo;
	private String musteriAdi;
	private String musteriSoyadi;
	
	public Musteri() {
	}

	public Musteri(int musteriId, int musteriNo, String musteriAdi, String musteriSoyadi) {
		this.musteriId = musteriId;
		this.musteriNo = musteriNo;
		this.musteriAdi = musteriAdi;
		this.musteriSoyadi = musteriSoyadi;
	}

	//@XmlAttribute
	@XmlElement
	public int getMusteriId() {
		return musteriId;
	}

	public void setMusteriId(int musteriId) {
		this.musteriId = musteriId;
	}

	@XmlElement
	public int getMusteriNo() {
		return musteriNo;
	}

	public void setMusteriNo(int musteriNo) {
		this.musteriNo = musteriNo;
	}

	@XmlElement
	public String getMusteriAdi() {
		return musteriAdi;
	}

	public void setMusteriAdi(String musteriAdi) {
		this.musteriAdi = musteriAdi;
	}

	@XmlElement
	public String getMusteriSoyadi() {
		return musteriSoyadi;
	}

	public void setMusteriSoyadi(String musteriSoyadi) {
		this.musteriSoyadi = musteriSoyadi;
	}

	@Override
	public String toString() {
		return "Musteri [musteriId=" + musteriId + ", musteriNo=" + musteriNo + ", musteriAdi=" + musteriAdi
				+ ", musteriSoyadi=" + musteriSoyadi + "]";
	}	
}