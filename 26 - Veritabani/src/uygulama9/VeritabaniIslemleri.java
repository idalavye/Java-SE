package uygulama9;

public interface VeritabaniIslemleri {
	
	public void ogrenciKaydet(Ogrenci ogrenci);
	
	public void ogrenciSil(int ogrenciId);
	
	public void ogrenciGuncelle(Ogrenci ogrenci);
	
	public void ogrenciListele();
	
	public void ogrenciBul(int ogrenciId);

}
