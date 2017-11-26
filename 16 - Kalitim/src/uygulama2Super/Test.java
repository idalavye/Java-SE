package uygulama2Super;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		
		
		Ogrenci ogrenci1 = new Ogrenci("Ferhat", "Aykan", "1994", "123123", null);
		
		ArrayList<String> dersler = new ArrayList<>();
		dersler.add("Matematik");
		dersler.add("Fizik");
		dersler.add("Kimya");
		
		ogrenci1.setDersler(dersler);
		
		System.out.println("Adi : " + ogrenci1.getAdi());
		System.out.println("Soyadi : " + ogrenci1.getSoyadi());
		
		
	}

}
