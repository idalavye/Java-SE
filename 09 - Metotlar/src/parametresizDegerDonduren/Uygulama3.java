package parametresizDegerDonduren;

import java.util.Scanner;

public class Uygulama3 {
	
	public static void main(String[] args) {
		
		String gelen = adSoyadAl();
		
		System.out.println("Hosgeldin " + gelen);
		
	}
	
	public static String adSoyadAl(){
		
		Scanner sc = new Scanner(System.in);
		
		String ad;
		
		String soyad;
		
		System.out.print("Adýnýzý giriniz : ");
		
		ad = sc.next();
		
		System.out.print("Soyadýnýzý giriniz : ");
		
		soyad = sc.next();
		
		sc.close();
		
		return ad + " "+ soyad;
	}
	

}
