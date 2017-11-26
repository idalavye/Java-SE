package scannerGiris;

import java.util.Scanner;

public class ScannerGiris2 {
	
	public static void main(String[] args) {
		
		
		Scanner	sc = new Scanner(System.in);
		
		System.out.print("Ýsminizi giriniz : ");
		
		String isim = sc.next();
		
		System.out.print("Bir sayi giriniz : ");
		
		int a = sc.nextInt();
		
		System.out.print("Bir sayi daha giriniz : ");
		
		int b = sc.nextInt();
		
		System.out.println("Merhaba " + isim);
		
		int toplam = a + b;
		
		System.out.println("Sonucunuz : " + toplam);
		
		
		sc.close();
	}

}
