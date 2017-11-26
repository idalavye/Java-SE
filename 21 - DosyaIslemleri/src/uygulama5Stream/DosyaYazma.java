package uygulama5Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DosyaYazma {
	
	private ObjectOutputStream objectOutputStream;
	
	public boolean dosyaOlustur(String dosyaAdi){
		
		String dosyaYolu = "C:/Users/aykan/Desktop/";
		
		try {
			
			FileOutputStream fileOutputStream = new FileOutputStream(dosyaYolu + dosyaAdi + ".txt");
		
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			
			return true;
			
		} catch (FileNotFoundException e) {

			System.err.println("FileOutputStream da hata olustu.");
			System.err.println("Hata : " + e);
			
		} catch (IOException e) {
			
			System.err.println("ObjectOutputStream da hata olustu.");
			System.err.println("Hata : " + e);
		}
		
		return false;
	}
	
	
	public void dosyaOgrenciKaydet(Ogrenci ogrenci){
		
		try {
			
			objectOutputStream.writeObject(ogrenci);
			
		} catch (IOException e) {
			
			System.err.println("Ogrenci kaydedilirken hata alýndý.");
			System.err.println("Hata : " + e);
		}

	}
	
	public void dosyaKapat(){
		
		if(objectOutputStream != null){
			
			try {
				
				objectOutputStream.close();
			
			} catch (IOException e) {
				System.err.println("objectOutputStream kapanýrken hata oluþtu.");
				System.err.println("Hata : " + e);
			} 
		
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
