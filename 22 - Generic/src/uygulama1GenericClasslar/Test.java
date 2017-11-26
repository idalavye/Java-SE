package uygulama1GenericClasslar;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		
		Ogretmen ogretmen1 = new Ogretmen("Ferhat", "Aykan", 1994);
		ogretmen1.setBrans("Java");

		Ogretmen ogretmen2 = new Ogretmen("Hakan", "Yýlmaz", 1995, "Fizik");
		
		Ogretmen ogretmen3 = new Ogretmen("Deniz", "Kaya", 1992);
		ogretmen3.setBrans("Deneme");
		
		
		Ogrenci ogrenci1 = new Ogrenci("Enes", "Cýnar", 1992, "123123");
		Ogrenci ogrenci2 = new Ogrenci("Burak", "Bilgic", 1994, "435");
		
		
		Islemler<Ogretmen> islemOgretmen = new Islemler<Ogretmen>();

		islemOgretmen.kaydet(ogretmen3);
		islemOgretmen.kaydet(ogretmen2);
		islemOgretmen.kaydet(ogretmen1);
		
		System.out.println("Ogretmenler");
		
		ArrayList<Ogretmen> ogretmenler = islemOgretmen.getListe();
		
		for(Ogretmen ogretmen : ogretmenler){
			
			System.out.println(ogretmen.getAdi() + " " + ogretmen.getSoyadi());
			
		}
		
		Islemler<Ogrenci> islemOgrenci = new Islemler<Ogrenci>();
		
		islemOgrenci.kaydet(ogrenci2);
		islemOgrenci.kaydet(ogrenci1);
		
		System.out.println("Ogrenciler");
		islemOgrenci.listele();
		
		
	}

}
