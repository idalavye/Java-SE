package scannerGiris;

import java.util.Scanner;

public class ScannerGiris1 {
	
	public static void main(String[] args) {
		
		//System.in klavyeden bir þey gireceðimiz zaman kullanýlýr.
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * sc.nextInt() => klavyeden sayi girisi
		 * 
		 * sc.nextDouble()
		 * 
		 * sc.nextFloat()
		 * 
		 * sc.next() => Klavyeden yazi girisi ama tek kelime
		 * 
		 * sc.nextLine() = > Klavyeden cümle
		 */
		
		System.out.print("Birseyler girin : ");
		
		String yazi = sc.next();
		
		
		System.out.println("Yazýlan yazi : " + yazi);
	
		sc.close();
		
	}
	

}
