package uygulama5Stream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DosyaOkuma {

	private ObjectInputStream objectInputStream;
	
	public boolean dosyayiOku(String dosyaAdi){
		
		String dosyaYolu = "C:/Users/aykan/Desktop/";
		
		try {
			FileInputStream fileInputStream = new FileInputStream(dosyaYolu + dosyaAdi + ".txt");
			
			objectInputStream = new ObjectInputStream(fileInputStream);
			
			return true;
		} catch (FileNotFoundException e) {
			
			System.err.println("Okunacak dosya bulunamad�.");
			System.err.println("Hata : " + e);
		
		} catch (IOException e) {
			
			System.err.println("Dosya a��l�rken bir hata olu�tu.");
			System.err.println("Hata : " + e);
		}
		return false;
	}
	
	public void dosyaOku(){
		
		try {

			while(true){
				
				Ogrenci ogrenci = (Ogrenci) objectInputStream.readObject();
				
				System.out.println(ogrenci);
				
			}
			
		} catch (EOFException | ClassNotFoundException e) {
			
			System.out.println("Dosya okuma i�lemi bitii.");
			
			return;
		
		}catch (IOException e) {
			
			System.err.println("Ogrenci nesnesi okunurken bir hata olustu.");
			System.err.println("Hata : " + e);
		}
		
		
	}
	
	public boolean dosyaOkumaKapat(){
		
		if(objectInputStream != null){
			
			try {
			
				objectInputStream.close();
		
			} catch (IOException e) {
			
				System.err.println("objectInputStream kapan�rken bir hata olustu.");
				System.err.println("Hata : " + e);
				
				return false;
			}
		}
		return true;
	}
	
	
}
