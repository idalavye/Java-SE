package diziGiris;

import java.util.Scanner;

public class DiziElemanToplamý {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int diziBoyut;
		
		int toplam = 0;		
		
		System.out.print("Kac elemanlý bir dizi oluþturacaksýnýz : ");
		diziBoyut = sc.nextInt();
		
		int [] sayilar = new int[diziBoyut];
		
		for(int i = 0; i < sayilar.length ; i++){
			
			System.out.print((i+1) + ". elamaný giriniz : ");
			
			sayilar[i] = sc.nextInt();
		}
		
		for(int i = 0; i < sayilar.length ; i++){
			
			toplam = toplam + sayilar[i];
		}
		
		System.out.println("Sayilarin toplamý : " + toplam);
		
		System.out.println("Sayilarin ortalamasi : " + (toplam / sayilar.length));
		
		sc.close();

	}

}
