package uygulama5;

import java.util.ArrayList;

public class OgrenciTest {

	public static void main(String[] args) {
		
		Ogrenci ogrenci1 = new Ogrenci("Ferhat", "Aykan", 1994, "123123", null);
		
		ArrayList<String> dersler = new ArrayList<>();
		dersler.add("Matematik");
		dersler.add("Fizik");
		dersler.add("Kimya");
		
		ogrenci1.setDersler(dersler);
		
		Ogrenci ogrenci2 = new Ogrenci("Osman", "Kaya", 1992, "213123", null);
		
		ogrenci2.setDersler(dersler);
		
		Ogrenci ogrenci3 = new Ogrenci("Bekir", "Deniz", 1993, "123125", null);
		
		Ogrenci ogrenci4 = new Ogrenci("Enes", "Çýnar", 1994, "123123", null);
		

		OgrenciIslemleri ogrIslem = new OgrenciIslemleri();
		
		ogrIslem.ogrenciEkle(ogrenci1);
		ogrIslem.ogrenciEkle(ogrenci2);
		ogrIslem.ogrenciEkle(ogrenci3);
		ogrIslem.ogrenciEkle(ogrenci4);
		
		System.out.println("------------------------------");
		
		ogrIslem.ogrenciListele();
		
		
		
	}
	
}
