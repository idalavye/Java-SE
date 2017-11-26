package uygulama5Stream;

public class Test {
	
	public static void main(String[] args) {
		
		/*
		Ogrenci ogrenci1 = new Ogrenci("Ferhat", "Aykan", 1994, "123123");
		Ogrenci ogrenci2 = new Ogrenci("Ahmet", "Yýldýz", 1992, "23423");
		Ogrenci ogrenci3 = new Ogrenci("Baki", "Kaya", 1995, "4252");
		
		DosyaYazma dosyaYazma = new DosyaYazma();
		
		dosyaYazma.dosyaOlustur("ogrenciler");
		
		dosyaYazma.dosyaOgrenciKaydet(ogrenci3);
		dosyaYazma.dosyaOgrenciKaydet(ogrenci2);
		dosyaYazma.dosyaOgrenciKaydet(ogrenci1);
		
		dosyaYazma.dosyaKapat();
		*/
		
		DosyaOkuma dosyaOkuma = new DosyaOkuma();
		
		dosyaOkuma.dosyayiOku("ogrenciler");
		dosyaOkuma.dosyaOku();
		dosyaOkuma.dosyaOkumaKapat();
		
		
	}

}
