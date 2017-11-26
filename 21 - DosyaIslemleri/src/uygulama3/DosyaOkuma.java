package uygulama3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DosyaOkuma {
	
	private Scanner sc;
	
	public void okunacakDosya(String dosyaAdi){
		
		String dosyaYolu = "C:/Users/aykan/Desktop/";
		
		try {
		
			sc = new Scanner(new File(dosyaYolu + dosyaAdi + ".txt"));
			
		
		} catch (FileNotFoundException e) {

			System.err.println("Hata : " + e);
		}
		
	}
	
	public void dosyayiSatirOku(){
		
		while(sc.hasNextLine()){
			
			System.out.println(sc.nextLine());
			
		}
	}
	
	public void dosyaKelimeOku(){
		
		while(sc.hasNext()){
			
			System.out.println(sc.next());
			
		}
	}
	
	
	public void dosyaOkumayiKapat(){
		
		sc.close();
	}
	

}
