package diziGiris;

import java.util.Scanner;

public class DiziElemanVererekOlusturma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int gun;
		
		
		System.out.print("Bir g�n giriniz : ");
		gun = sc.nextInt();
		
						   //    0 			1		2			3			4		5			6	
		String [] gunler = {"Pazartesi", "Sal�", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"};
		
		if(gun >= 0 && gun < 7){
			
			System.out.println(gunler[gun-1]);
		}
		else{
			System.out.println("Girdi�iniz g�n sayisine g�re bir g�n bulunamam�s�t�r.");
		}
		sc.close();
		
	}
	
}
