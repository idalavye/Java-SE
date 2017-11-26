package islemler;

import java.util.List;

import tasarim.Ogretmen;

public interface OgretmenIslemleri {
	
	public boolean ogretmenKaydet(Ogretmen ogretmen);
	
	public boolean ogretmenSil(int id);
	
	public Ogretmen ogretmenGuncelle(Ogretmen ogretmen);
	
	public List<Ogretmen> ogrencileriAl();
	
	public Ogretmen ogrenciBul(int id);

}
