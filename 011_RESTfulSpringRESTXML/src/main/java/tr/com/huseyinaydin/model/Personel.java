package tr.com.huseyinaydin.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, RESTful Web Services, Spring.
* 
*/

@XmlRootElement(name = "personel")
@XmlAccessorType(XmlAccessType.NONE)
public class Personel implements Serializable {

	private static final long serialVersionUID = 1L;

	// @XmlAttribute
	@XmlElement
	private Integer id;

	@XmlElement
	private String adi;

	@XmlElement
	private String soyadi;

	@XmlElement
	private String email;

	public Personel() {
	}

	public Personel(Integer id, String adi, String soyadi, String email) {
		this.id = id;
		this.adi = adi;
		this.soyadi = soyadi;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}