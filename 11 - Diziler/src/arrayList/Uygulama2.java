package arrayList;

import java.util.ArrayList;

public class Uygulama2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> kursOgrenciListesi = new ArrayList<>();
		
		ArrayList<String> ingDersOgrenci = new ArrayList<>();
		
		ArrayList<String> ispanyolcaDersOgrenci = new ArrayList<>();
		
		
		ingDersOgrenci.add("Ferhat");
		ingDersOgrenci.add("Ahmet");
		ingDersOgrenci.add("Betül");
		
		ispanyolcaDersOgrenci.add("Burak");
		ispanyolcaDersOgrenci.add("Ömer");
		ispanyolcaDersOgrenci.add("Cengiz");
		
		kursOgrenciListesi.addAll(ispanyolcaDersOgrenci);
		kursOgrenciListesi.addAll(ingDersOgrenci);
		
		System.out.println("Kursdaki öðrenci listesi : ");
		for(String ogr : kursOgrenciListesi){
			
			System.out.println(ogr);
		}
		
		System.out.println();
		System.out.println("Ýngilizce dersini alan öðrenci listesi : ");
		for(String ogr : ingDersOgrenci){
			
			System.out.println(ogr);
		}
		
		System.out.println();
		System.out.println("Ýspanyolca dersini alan öðrenci listesi : ");
		for(String ogr : ispanyolcaDersOgrenci){
			
			System.out.println(ogr);
		}
		
		
	}

}
