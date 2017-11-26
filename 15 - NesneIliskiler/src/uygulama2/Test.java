package uygulama2;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		
		Ogrenci.setOkul("Dumlupýnar Üniversitesi");
		
		Ogrenci ogrenci1 = new Ogrenci("Ferhat", "Aykan", 1994, "21312312");
		
		Adres adres1 = new Adres("2323", "Vakýf Sokak", "Lala Mahallesi", "Merkez", "Kütahya");
		
		ogrenci1.setAdres(adres1);
		
		Araba araba1 = new Araba("Mercedes", "CLA", 2012);
		Araba araba2 = new Araba("BMW", "520d", 2015);
		
		ArrayList<Araba> arabalar = new ArrayList<>();
		arabalar.add(araba1);
		arabalar.add(araba2);
		
		ogrenci1.setArabalar(arabalar);
		
		ArrayList<String> telefonNumaralari = new ArrayList<>();
		telefonNumaralari.add("05555555555");
		telefonNumaralari.add("0213123123");
		telefonNumaralari.add("21312312312312");
		
		ogrenci1.setTelefonNumaralari(telefonNumaralari);
	
		System.out.println("-----------------------------------------------");
		
		Ogrenci ogrenci2 = new Ogrenci("Ahmet", "Aykan", 1989, "213123123");
		
		Adres adres2 = new Adres("12", "Cavdar", "Meydan Maha", "Merkez", "Adana");
		
		Araba araba3 = new Araba("Sahin", "Toros", 1998);
		ArrayList<Araba> arabalar2 = new ArrayList<>();
		arabalar2.add(araba3);
		
		ogrenci2.setAdres(adres2);
		ogrenci2.setArabalar(arabalar2);
		
		ArrayList<String> telefonNumaralari2 = new ArrayList<>();
		telefonNumaralari2.add("05123213123");
		telefonNumaralari2.add("123123123");
		telefonNumaralari2.add("2535345312");
		
		ogrenci2.setTelefonNumaralari(telefonNumaralari2);
		
		System.out.println("-----------------------------------------------");
		
		ogrenciBilgileriniYazdir(ogrenci1);
		
		System.out.println();
		
		ogrenciBilgileriniYazdir(ogrenci2);
		
	
	}
	
	
	

	public static void ogrenciBilgileriniYazdir(Ogrenci ogrenci){
		
		
		System.out.println("Adi : " + ogrenci.getAdi());
		System.out.println("Soyadi : " + ogrenci.getSoyadi());
		System.out.println("DogumYili : " + ogrenci.getDogumYili());
		System.out.println("Okul Numarasi : " + ogrenci.getOkulNumarasi());
		System.out.println("Telefon numaralari : " + ogrenci.getTelefonNumaralari());
		System.out.println("Dersleri : " + ogrenci.getDersler());
		System.out.println("Okulu : " + Ogrenci.getOkul());
		System.out.println("Adresi : " + ogrenci.getAdres());
		
		ArrayList<Araba> arabalar = ogrenci.getArabalar();
		
		System.out.println("Arabalar : ");
		
		for (Araba araba : arabalar) {
			
			System.out.println(araba.getMarka() + " - " + araba.getModel());
		}
		
	}
	
}
