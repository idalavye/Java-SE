package uygulamalar;

import java.util.Scanner;

public class Uygulama6 {
	
	/*
	 * 
	 * 	Matematik problemi:
	 * 
	 * 	Bir f(x, y) fonksiyonu klavyeden girilen degerler için hesaplayalým.
	 * 
	 * 
	 * 	x > 0, y > 0  f(x, y) = x^2 + y^2 + 2*x*y + 5
	 * 
	 * 	x < 0, y > 0  f(x, y) = 2*x*y + 150 ;
	 * 
	 *  x > 0, y < 0  f(x, y) = 2*x + 5 * y + 10 
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x;
		
		double y;
		
		double sonuc;
		
		System.out.print("Klavyeden bir x degerini giriniz : ");
		
		x = sc.nextDouble();
		
		System.out.print("Bir y degerini giriniz : ");
		
		y = sc.nextDouble();
		
		
		if(x > 0 && y > 0){
			
			sonuc = x * x + y * y + 2 * x * y + 5;
		}
		else if(x < 0 && y > 0){
			
			sonuc = 2 * x * y + 150;
		}
		else if(x > 0 && y < 0){
			
			sonuc = 2 * x + 5 * y + 10;
		}
		else{
			
			System.out.println("Girdiðiniz x ve y degerleri probleme uygun degildir.");
			sonuc = 0;
			
		}
		
		System.out.println("Sonucumuz  : " + sonuc);
		
		sc.close();
	}
	

}
