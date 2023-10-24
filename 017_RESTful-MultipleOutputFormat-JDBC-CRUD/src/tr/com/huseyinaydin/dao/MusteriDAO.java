package tr.com.huseyinaydin.dao;

import java.sql.Connection;
import java.util.List;

import tr.com.huseyinaydin.model.pojo.entity.bean.Musteri;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, RESTful Web Services.
* 
*/

public interface MusteriDAO {
	public Connection veritabaninaBaglantiKur(); 
	public List<Musteri> veriOku();
	public Musteri veriOku(int musteriId);
	public boolean veriEkle(Musteri musteri);
	public boolean veriDuzenle(Musteri musteri, int musteriId);
	public boolean veriSilme(int musteriId);
}