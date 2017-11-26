package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uygulama3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String isim;
		
		ArrayList<String> isimListesi = new ArrayList<>();
		
		isimListesi.add("ferhat");
		isimListesi.add("ahmet");
		isimListesi.add("burak");
		isimListesi.add("enes");
		isimListesi.add("salih");
		isimListesi.add("�mer");
		
		System.out.print("Listeden arad�g�n�z isim : ");
		isim = sc.next();
		
		boolean durum = isimListesi.contains(isim);
		
		if(durum){
			
			System.out.println("indeksi : " + (isimListesi.indexOf(isim) + 1));
		}
		else{
			System.out.println("Arad�g�n�z isim bulunamad�!");
		}
		
		List<String> yeniListe =  isimListesi.subList(0, 3);
		
		for (String string : yeniListe) {
			
			System.out.println(string);
			
		}
		sc.close();
	}

}
