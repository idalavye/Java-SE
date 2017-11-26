package uygulama3;

import java.util.ArrayList;

public class OgrenciTest {
	
	public static void main(String[] args) {
		
		ArrayList<String> dersler = new ArrayList<>();
	
		dersler.add("Matematik");
		dersler.add("Fizik");
		dersler.add("Kimya");
		dersler.add("Biyoloji");
		
		ArrayList<String> dersler2 = new ArrayList<>();
		
		dersler2.add("Türkce");
		dersler2.add("Matematik");
		dersler2.add("Sosyal bilgileri");
		dersler2.add("Hayat bilgisi");
		
		
		Ogrenci ogrenci1 = new Ogrenci("Ferhat", "Aykan", 1994, "213123", dersler);
		
		Ogrenci ogrenci2 = new Ogrenci("Ahmet", "Aykan", 2011, "213123", dersler2);
		

		OgrenciIslemleri ogrenciIslemleri = new OgrenciIslemleri();
		
		String ders = "Türkce";
		
		ogrenciIslemleri.ogrenciDersArama(ogrenci1, ders);
		
		ogrenciIslemleri.ogrenciDersArama(ogrenci2, ders);
		
		
		
	}

}
