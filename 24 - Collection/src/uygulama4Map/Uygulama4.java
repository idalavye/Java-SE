package uygulama4Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Uygulama4 {

	public static void main(String[] args) {
		
		/*
		 * Map - > her bir degeri key value iliþkisiyle tutuyor.
		 * 
		 * 			kullanýcýAdi - "Ferhat";
		 * 
		 * 			sifre - "Aykan"
		 * 
		 */
		/*
		Map<String, String> map = new HashMap<>();
		
		map.put("kullaniciAdi", "Ferhat");
		map.put("sifre", "Aykan");
		
		String sonuc = map.get("sifre");
		
		System.out.println("Sonuc : " + sonuc);
		*/
		/*
		Map<String, Ogrenci> map2 = new HashMap<>();
		
		Ogrenci ogrenci1 = new Ogrenci("FERHAT", "Aykan");
		Ogrenci ogrenci2 = new Ogrenci("Osman", "Yýlmaz");
		
		map2.put("java", ogrenci1);
		map2.put("csharp", ogrenci2);
		
		Ogrenci ogrenci = map2.get("java");
		
		System.out.println(ogrenci);
		*/
		
		Map<String, Ogrenci> map2 = new HashMap<>();
		
		Ogrenci ogrenci1 = new Ogrenci("FERHAT", "Aykan");
		Ogrenci ogrenci2 = new Ogrenci("Osman", "Yýlmaz");
		
		map2.put("java", ogrenci1);
		map2.put("csharp", ogrenci2);
		
		Set<String> key = map2.keySet();
		
		System.out.println(key);
		
		int sonuc = map2.size();
		
		System.out.println(sonuc);
		
		System.out.println(map2);
		
		Collection<Ogrenci> collection = map2.values();
		
		System.out.println(collection);
		
		
	}
	
}
