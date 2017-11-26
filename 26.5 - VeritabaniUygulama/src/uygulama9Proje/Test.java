package uygulama9Proje;

public class Test {
	
	public static void main(String[] args) {
		
		VeritabaniIslemleri islemler = new VeritabaniIslemleriImpl();
		
		Ogrenci ogrenci = new Ogrenci(4, "Mevlüt", "Sevinç", 1997, "b151210005");
		
		//islemler.ogrenciKaydet(ogrenci);
		
		//islemler.ogrensiSil(105);
		
		islemler.ogrenciGuncelle(ogrenci);
		
		//islemler.ogrenciListele();
		
		islemler.ogrenciBul(4);
		
	}

}
