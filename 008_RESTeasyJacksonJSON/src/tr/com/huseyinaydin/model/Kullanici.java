package tr.com.huseyinaydin.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "kullanici")
public class Kullanici implements Serializable {

	private static final long serialVersionUID = 1L;

	// @XmlAttribute(name="id")
	@XmlElement(name = "id")
	int kullaniciId;

	@XmlElement(name = "adi")
	String kullaniciAdi;

	@XmlElement(name = "soyadi")
	String kullaniciSoyadi;

	public int getKullaniciId() {
		return kullaniciId;
	}

	public void setKullaniciId(int kullaniciId) {
		this.kullaniciId = kullaniciId;
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public String getKullaniciSoyadi() {
		return kullaniciSoyadi;
	}

	public void setKullaniciSoyadi(String kullaniciSoyadi) {
		this.kullaniciSoyadi = kullaniciSoyadi;
	}
}