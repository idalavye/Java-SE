package diziGiris;

import java.util.Scanner;

public class DiziElemanVermeFor {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int diziBoyut;
		
		
		System.out.print("Dizinin boyutunu giriniz :");
		diziBoyut = sc.nextInt();
		
		int [] sayilar = new int[diziBoyut];
		
		/*
		 * Boyutu sonradan deðiþtirebiliriz.s
		 * sayilar = new int[10];
		 */
		
		for(int i = 0; i < sayilar.length ; i++){
			
			System.out.print((i+1) + ". sayiyi giriniz : ");
			sayilar[i] = sc.nextInt();
			
		}
		
		for(int i = 0;  i < sayilar.length ; i++){
			
			System.out.print(sayilar[i] + " ");
			
			
		}
		
		sc.close();
		
	}

}
