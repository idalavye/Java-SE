package islemler;

import java.util.List;

import tasarim.Ogrenci;

public interface OgrenciIslemleri {
	
	public boolean ogrenciKaydet(Ogrenci ogrenci);
	
	public boolean ogrenciSil(int id);
	
	public Ogrenci ogrenciGuncelle(Ogrenci ogrenci);
	
	public List<Ogrenci> ogrencileriAl();
	
	public Ogrenci ogrenciBul(int id);
}
