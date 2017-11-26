package parametreliDegerDonduren;

import java.util.Scanner;

public class Uygulama3 {
	
	public static void main(String[] args) {
		
		String a = adSoyadAl();
		
		//String adSoyad = a;
		
		yaz(a);
		
		
		
	}

	public static String adSoyadAl(){
		
		Scanner sc = new Scanner(System.in);
		
		String ad;
		
		String soyad;
		
		System.out.print("Adýnýz : ");
		
		ad = sc.next();
		
		System.out.print("Soyadýnýz : ");
		
		soyad = sc.next();
		
		sc.close();
		
		return ad + " " + soyad;
		
	}
	
	public static void yaz(String adSoyad){
		
		System.out.println("Hosgeldin, " + adSoyad);
	}
	
	
}
