package tr.com.huseyinaydin.kullanici;

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
* @category Java, RESTful Web Services.
* 
*/

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "kullanici")
public class Kullanici implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlAttribute(name = "id")
	private int id;

	@XmlAttribute(name = "uri")
	private String uri;

	@XmlElement(name = "adi")
	private String adi;

	@XmlElement(name = "soyadi")
	private String soyadi;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
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
}