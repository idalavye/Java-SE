package uygulama3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DosyaYazma {
	
	private PrintWriter printWriter;
	
	public boolean dosyaOlustur(String dosyaAdi){
		
		String dosyaYolu = "C:/Users/aykan/Desktop/";
		
		try {
			
			printWriter = new PrintWriter(dosyaYolu + dosyaAdi + ".txt");
			
			return true;
			
		} catch (FileNotFoundException e) {
		
			System.err.println("Hata :" + e);

			return false;
		}
	}
	
	public void ogrenciyiKaydet(Ogrenci ogrenci){
		
		String adi = ogrenci.getAdi();
		String soyadi = ogrenci.getSoyadi();
		int dogumYili = ogrenci.getDogumYili();
		String okulNumarasi = ogrenci.getOkulNumarasi();
		
		printWriter.println(adi + " " + soyadi + " " + dogumYili + " " + okulNumarasi);
	}
	
	public boolean dosyaYazmayiKapat(){
		
		try{
			
			printWriter.close();
			
			return true;
		}catch (Exception e) {
			
			System.err.println("Hata : " + e);
			return false;
		}
		
	}
	

}
