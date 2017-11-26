package arrayList;

import java.util.ArrayList;

public class Uygulama2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> kursOgrenciListesi = new ArrayList<>();
		
		ArrayList<String> ingDersOgrenci = new ArrayList<>();
		
		ArrayList<String> ispanyolcaDersOgrenci = new ArrayList<>();
		
		
		ingDersOgrenci.add("Ferhat");
		ingDersOgrenci.add("Ahmet");
		ingDersOgrenci.add("Bet�l");
		
		ispanyolcaDersOgrenci.add("Burak");
		ispanyolcaDersOgrenci.add("�mer");
		ispanyolcaDersOgrenci.add("Cengiz");
		
		kursOgrenciListesi.addAll(ispanyolcaDersOgrenci);
		kursOgrenciListesi.addAll(ingDersOgrenci);
		
		System.out.println("Kursdaki ��renci listesi : ");
		for(String ogr : kursOgrenciListesi){
			
			System.out.println(ogr);
		}
		
		System.out.println();
		System.out.println("�ngilizce dersini alan ��renci listesi : ");
		for(String ogr : ingDersOgrenci){
			
			System.out.println(ogr);
		}
		
		System.out.println();
		System.out.println("�spanyolca dersini alan ��renci listesi : ");
		for(String ogr : ispanyolcaDersOgrenci){
			
			System.out.println(ogr);
		}
		
		
	}

}
