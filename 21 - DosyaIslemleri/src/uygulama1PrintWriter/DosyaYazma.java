package uygulama1PrintWriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DosyaYazma {
	
	public static void main(String[] args){
		
			System.out.println("Yazma islemi baslýyor");
		
			PrintWriter yazici = null;
			
			try {
				yazici = new PrintWriter("C:/Users/aykan/Desktop/metin.txt");
				yazici.println("Ferhat ne yapýyorsun");
				yazici.println("Aykan nasýlsýn");
				yazici.println("Merhaba");
				yazici.close();
				
			} catch (FileNotFoundException e) {
				
				System.err.println("Hata : " + e.getMessage());
			}
			
			System.out.println("Hata : ");
		
	}

}
