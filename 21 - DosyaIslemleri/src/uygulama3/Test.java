package uygulama3;

public class Test {
	
	public static void main(String[] args) {
		
		/*
		Ogrenci ogrenci1 = new Ogrenci("Ferhat", "Aykan", 1994, "213123");
		Ogrenci ogrenci2 = new Ogrenci("Osman", "Kaya", 1992, "123123");
		
		DosyaYazma dosyaYazma = new DosyaYazma();
		
		boolean dosyaOlusturmaDurumu = dosyaYazma.dosyaOlustur("ogrenciler");
		
		if(dosyaOlusturmaDurumu){
			System.out.println("Dosya basarýlý bir sekilde oluþturuldu.");
		}
		else{
			System.out.println("Dosya oluþturulurken bir hata oluþtu.");
		}
		
		
		dosyaYazma.ogrenciyiKaydet(ogrenci1);
		dosyaYazma.ogrenciyiKaydet(ogrenci2);
		
		
		boolean dosyaYazmaKapanmaDurumu = dosyaYazma.dosyaYazmayiKapat();
		
		if(dosyaYazmaKapanmaDurumu){
			System.out.println("Dosya basarýlý bir sekilde kapatýldý.");
		}
		else{
			System.out.println("Dosya kapatýlýrken bir hata oluþtu.");
		}
		*/
		
		DosyaOkuma dosyaOkuma = new DosyaOkuma();
		
		dosyaOkuma.okunacakDosya("ogrenciler");
		dosyaOkuma.dosyaKelimeOku();
		dosyaOkuma.dosyaOkumayiKapat();
		
	}

}
