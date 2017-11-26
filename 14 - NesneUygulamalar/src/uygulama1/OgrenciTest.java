package uygulama1;

import java.util.ArrayList;

public class OgrenciTest {
	
	public static void main(String[] args) {
		
		ArrayList<String> dersler = new ArrayList<>();
	
		ArrayList<String> dersler2 = new ArrayList<>();
		
		dersler.add("Matematik");
		dersler.add("Fizik");
		dersler.add("Kimya");
		dersler.add("Biyoloji");
		
		
		dersler2.add("Ýngilizce");
		dersler2.add("Fransýzca");
		dersler2.add("Almanca");
		dersler2.add("Türkce");
		
		Ogrenci ogrenci1 = new Ogrenci("Ferhat", "Aykan", 1994, "213123", dersler);
		
		Ogrenci ogrenci2 = new Ogrenci();
		ogrenci2.setAdi("Enes");
		ogrenci2.setSoyadi("Cýnar");
		ogrenci2.setDogumYili(1994);
		ogrenci2.setOkulNumarasi("131231231");
		ogrenci2.setDersler(dersler2);
		
		
		Ogrenci ogrenci3 = new Ogrenci("Osman", "Kaya", 1989, "213123", dersler);
		
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		
	}

}
