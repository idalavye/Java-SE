package uygulama3toString;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		
		
		Ogrenci ogrenci1 = new Ogrenci("Ferhat", "Aykan", "1994", "123123", null);
		
		ArrayList<String> dersler = new ArrayList<>();
		dersler.add("Matematik");
		dersler.add("Fizik");
		dersler.add("Kimya");
		
		ogrenci1.setDersler(dersler);
		
		Ogrenci ogrenci2 = new Ogrenci("Ahmet", "Yýlmaz", "21312");
		
		ArrayList<String> derslerTM = new ArrayList<>();
		derslerTM.add("Türkce");
		derslerTM.add("Cografya");
		derslerTM.add("Tarih");
		
		
		ogrenci2.setOkulNumarasi("4141");
		
		ogrenci2.setDersler(derslerTM);
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		
	}

}
