package diziGiris;

import java.util.Scanner;

public class DiziMetotlar {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int diziBoyut;
		
		System.out.print("Kac elemanlý bir dizi gireceksiniz : ");
		diziBoyut = sc.nextInt();
		
		int [] sayilar = diziElemanlariniAl(diziBoyut);
		
		diziElemanYazdir(sayilar);
		
	}
	
	public static void diziElemanYazdir(int [] s){
		
		for(int i = 0; i < s.length ; i++){
			
			System.out.println(s[i]);
			
		}
	}
	
	public static int[] diziElemanlariniAl(int boyut){
		
		int [] sayilar = new int[boyut];
		
		for(int i = 0 ; i < sayilar.length ; i++){
			
			System.out.print((i+1) + ". elamani giriniz : ");
			
			sayilar[i] = sc.nextInt();
		}
		
		return sayilar;
	}
	
	

}
