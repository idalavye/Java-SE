package uygulamalar;

import java.util.Scanner;

public class VizeFinalOrtalama {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double vize;
		
		double finall;
		
		double ortalama;
		
		System.out.print("Vize notunuzu giriniz : ");
		
		vize = sc.nextDouble();
		
		System.out.print("Final notunuzu giriniz : ");
		
		finall = sc.nextDouble();
		
		ortalama = vize*0.4 + finall * 0.6;
		
		System.out.println("Ortalamanýz : " + ortalama);
		
		/*
		 *  && = iki kosul dogruysa içine gir. Mantýk olaylarý 1 ve 1 = 1, 1 ve 0 = 0
		 *  
		 *  || = iki kosuldan bir tanesi dogru ise calýsýr.  1 veya 1 = 1, 1 veya 0 = 1
		 *  
		 * 
		 */
		
		
		if(ortalama >= 90 && ortalama <= 100){
			
			System.out.println("Harf notunuz : AA");
		}
		else if(ortalama >= 80 && ortalama < 90){
			
			System.out.println("Harf notunuz : BB");
		}
		else if(ortalama >= 70 && ortalama < 80){
			
			System.out.println("Harf notunuz : CC");
		}
		else if(ortalama < 70){
			
			System.out.println("Kaldýnýz.");
			System.out.println("Harf notunuz : FF");
			
		}
		else{
			System.out.println("Uygun bir harf notu bulunamadý.");
		}
		
		sc.close();
		
	}
	

}
