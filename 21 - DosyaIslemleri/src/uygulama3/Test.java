package uygulama3;

public class Test {
	
	public static void main(String[] args) {
		
		/*
		Ogrenci ogrenci1 = new Ogrenci("Ferhat", "Aykan", 1994, "213123");
		Ogrenci ogrenci2 = new Ogrenci("Osman", "Kaya", 1992, "123123");
		
		DosyaYazma dosyaYazma = new DosyaYazma();
		
		boolean dosyaOlusturmaDurumu = dosyaYazma.dosyaOlustur("ogrenciler");
		
		if(dosyaOlusturmaDurumu){
			System.out.println("Dosya basar�l� bir sekilde olu�turuldu.");
		}
		else{
			System.out.println("Dosya olu�turulurken bir hata olu�tu.");
		}
		
		
		dosyaYazma.ogrenciyiKaydet(ogrenci1);
		dosyaYazma.ogrenciyiKaydet(ogrenci2);
		
		
		boolean dosyaYazmaKapanmaDurumu = dosyaYazma.dosyaYazmayiKapat();
		
		if(dosyaYazmaKapanmaDurumu){
			System.out.println("Dosya basar�l� bir sekilde kapat�ld�.");
		}
		else{
			System.out.println("Dosya kapat�l�rken bir hata olu�tu.");
		}
		*/
		
		DosyaOkuma dosyaOkuma = new DosyaOkuma();
		
		dosyaOkuma.okunacakDosya("ogrenciler");
		dosyaOkuma.dosyaKelimeOku();
		dosyaOkuma.dosyaOkumayiKapat();
		
	}

}
