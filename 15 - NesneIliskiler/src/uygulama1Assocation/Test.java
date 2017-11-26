package uygulama1Assocation;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		
		//Assocation = Birleþme 
		//Bu þekil birleþmeye Has-a iliþkiþi deniyor....
		
		Adres adres1 = new Adres("23", "Vakf Sokak", "Lala Mahallesi", "Merkez", "Kütahya");
		
		
		Ogrenci ogrenci1 = new Ogrenci("Ferhat", "Aykan", 1994, null, "255522", null, null);
		
		ogrenci1.setAdres(adres1);
		
		ArrayList<String> dersler = new ArrayList<>();
		dersler.add("Matematik");
		dersler.add("Fizik");
		dersler.add("Kimya");
		
		ogrenci1.setDersler(dersler);
		
		ArrayList<String> numaralar = new ArrayList<>();
		
		numaralar.add("0555 555 55 55");
		numaralar.add("0544 444 44 44");
		
		ogrenci1.setTelefonNumaralari(numaralar);
		
		
		System.out.println(ogrenci1);
		
	}

}
