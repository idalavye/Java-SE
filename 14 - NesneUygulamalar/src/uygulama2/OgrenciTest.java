package uygulama2;

import java.util.ArrayList;

public class OgrenciTest {
	
	public static void main(String[] args) {
		
		ArrayList<String> dersler = new ArrayList<>();
	
		dersler.add("Matematik");
		dersler.add("Fizik");
		dersler.add("Kimya");
		dersler.add("Biyoloji");
		
		Ogrenci ogrenci1 = new Ogrenci("Ferhat", "Aykan", 1994, "213123", dersler);
		
		Ogrenci ogrenci2 = new Ogrenci("Ahmet", "Aykan", 2011, "213123", dersler);
		
		dersleriGoster(ogrenci1);
		
		dersleriGoster(ogrenci2);
		

	}
	
	public static void bilgileriGoruntule(Ogrenci ogrenci){
		
		System.out.println("Adi : " + ogrenci.getAdi());
		System.out.println("Soyadi : " + ogrenci.getSoyadi());
		System.out.println("Dogum yili : " + ogrenci.getDogumYili());
		System.out.println("Okul numarasi : " + ogrenci.getOkulNumarasi());
		System.out.println("Aldýgý dersler : " + ogrenci.getDersler());
	}
	
	public static void dersleriGoster(Ogrenci ogrenci){
		
		ArrayList<String> dersler = ogrenci.getDersler();
		
		System.out.println(ogrenci.getAdi() + " aldýgý dersler : ");
		for(String ders : dersler){
			System.out.println(ders);
		}
		
	}
	

}
