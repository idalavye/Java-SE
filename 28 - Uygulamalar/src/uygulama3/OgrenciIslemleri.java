package uygulama3;

import java.util.ArrayList;

public interface OgrenciIslemleri {
	
	public void ogrenciKaydet(Ogrenci ogrenci);
	
	public void ogrenciSil(Ogrenci ogrenci);
	
	public ArrayList<Ogrenci> ogrenciListele();
	
	public Ogrenci ogrenciBul(String adi);

}
