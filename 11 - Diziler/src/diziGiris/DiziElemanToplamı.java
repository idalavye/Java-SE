package diziGiris;

import java.util.Scanner;

public class DiziElemanToplamı {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int diziBoyut;
		
		int toplam = 0;		
		
		System.out.print("Kac elemanlı bir dizi oluşturacaksınız : ");
		diziBoyut = sc.nextInt();
		
		int [] sayilar = new int[diziBoyut];
		
		for(int i = 0; i < sayilar.length ; i++){
			
			System.out.print((i+1) + ". elamanı giriniz : ");
			
			sayilar[i] = sc.nextInt();
		}
		
		for(int i = 0; i < sayilar.length ; i++){
			
			toplam = toplam + sayilar[i];
		}
		
		System.out.println("Sayilarin toplamı : " + toplam);
		
		System.out.println("Sayilarin ortalamasi : " + (toplam / sayilar.length));
		
		sc.close();

	}

}
