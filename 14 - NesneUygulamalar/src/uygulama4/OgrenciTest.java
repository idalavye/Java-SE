package uygulama4;

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
		
		
		ArrayList<Ogrenci> ogrenciler = new ArrayList<>();
		
		ogrenciler.add(ogrenci4);
		ogrenciler.add(ogrenci3);
		ogrenciler.add(ogrenci2);
		ogrenciler.add(ogrenci1);
		
		for(Ogrenci ogrenci : ogrenciler){
			
			System.out.println(ogrenci.getIsim());
		}

	}
	
}
