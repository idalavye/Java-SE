package uygulamalar;

import java.util.Scanner;

public class Uygulama2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int baslangic;
		
		int bitis;
		
		
		System.out.print("Hangi sayidan ba�lamak istiyorsunuz : ");
	
		baslangic = sc.nextInt();
		
		System.out.print("Biti� degeri :");
		
		bitis = sc.nextInt();
		
		for(int i = baslangic ; i <= bitis ; i++ ){
			
			if( (i % 3) == 0 || (i % 4) == 0 ){
				
				System.out.print( i + " " );
				
			}
			
		}
		
		sc.close();
	}

}
