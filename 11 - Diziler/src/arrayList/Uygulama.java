package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Uygulama {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sayi;
		boolean durum = true;
		
		System.out.print("Listeden aranacak sayi : ");
		sayi = sc.nextInt();
		
		ArrayList<Integer> sayiListesi = new ArrayList<>();
		
		sayiListesi.add(121);
		sayiListesi.add(32);
		sayiListesi.add(2423);
		sayiListesi.add(16);
		

		for(int i = 0 ; i < sayiListesi.size(); i++){
			
			if(sayiListesi.get(i) == sayi){
				
				System.out.println("Sayi bulundu.");
				System.out.println("Ýndex'i : " + i);
				durum = false;
			}
			
		}
		if(durum){
			
			System.out.println("Sayi bulunamadý.");
		}
		
		sc.close();
	}

}
