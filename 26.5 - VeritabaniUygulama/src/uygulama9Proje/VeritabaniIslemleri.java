package uygulama9Proje;

public interface VeritabaniIslemleri {
	
	public void ogrenciKaydet(Ogrenci ogrenci);
	
	public void ogrensiSil(int ogrenciId);
	
	public void ogrenciGuncelle(Ogrenci ogrenci);
	
	public void ogrenciListele();
	
	public void ogrenciBul(int ogrenciId);

}
