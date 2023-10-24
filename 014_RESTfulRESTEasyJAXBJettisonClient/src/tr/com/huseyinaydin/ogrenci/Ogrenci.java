package tr.com.huseyinaydin.ogrenci;

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

@XmlRootElement (name="ogrenci")
public class Ogrenci {

	private int id;
	private String adi;
	private String soyadi;
	private int yasi;
	
	public Ogrenci() {
	}

	public Ogrenci(int id, String adi, String soyadi, int yasi) {
		this.id = id;
		this.adi = adi;
		this.soyadi = soyadi;
		this.yasi = yasi;
	}

	//@XmlAttribute
	@XmlElement
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@XmlElement
	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	@XmlElement
	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	@XmlElement
	public int getYasi() {
		return yasi;
	}

	public void setYasi(int yasi) {
		this.yasi = yasi;
	}

	@Override
	public String toString() {
		return "Ogrenci [id=" + id + ", adi=" + adi + ", soyadi=" + soyadi + ", yasi=" + yasi + "]";
	}	
}