package deltaHesaplama;

import java.util.Scanner;

public class DeltaHesaplama {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b; 
		int c;
		
		System.out.print("A degerini giriniz : ");
		a = sc.nextInt();
		
		System.out.print("B degerini giriniz : ");
		b = sc.nextInt();
		
		System.out.print("C degerini giriniz : ");		
		c = sc.nextInt();
		
		double delta = deltaHesapla(a, b, c);
		
		System.out.println("Delta : " + delta);
		
		deltaKontrol(delta);
		
		sc.close();
	}
	
	public static double deltaHesapla(int a, int b, int c){
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		return delta;
	}
	
	public static void deltaKontrol(double delta){
	
		if(delta > 0){
			
			System.out.println("Ýki reel kök vardýr.");
			
		}
		else if(delta == 0){
			
			System.out.println("Ýki eþit kök vardýr.");
		}
		else{
			
			System.out.println("Kök yoktur.");
			
		}
	}
	

}
