package uygulama2Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DosyaOkuma {
	
	public static void main(String[] args) {
		
		File dosya = new File("C:/Users/aykan/Desktop/metin.txt");
		
		try {
			
			Scanner sc = new Scanner(dosya);
			
			/*
			String ilkSatir = sc.nextLine();
			String ikinciSatir = sc.nextLine();
			
			System.out.println(ilkSatir);
			System.out.println(ikinciSatir);
			*/
			
			String metinBelgesi = "";
			
			
			while(sc.hasNextLine()){
				
				
				metinBelgesi +=sc.nextLine();
				metinBelgesi += " ";
			}
			
			System.out.println(metinBelgesi);
			
			sc.close();
			
		} catch (FileNotFoundException e) {
			
			System.err.println("Hata : " + e);
		}
		
		
		
	}

}
