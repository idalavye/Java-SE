package uygulama6Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Uygulama1 {
	
	
	public static void main(String[] args) {
		
		
		BufferedReader bufferedReader = null;
		
		try {

			FileReader fileReader = new FileReader("C:/Users/aykan/Desktop/deneme.txt");
			
			bufferedReader = new BufferedReader(fileReader);
			
			String satir;
			
			while( (satir = bufferedReader.readLine()) != null ){
					
				System.out.println(satir);
			}
			/*
			while(true){
				
				satir = bufferedReader.readLine();
				
				if(satir == null){
					break;
				}
				else{
					System.out.println(satir);
				}
			}
			*/
			
		} catch (IOException e) {
			
			System.err.println("Hata : " + e);
		
		}finally {
			
			try {
				
				if(bufferedReader != null){
					
					bufferedReader.close();
				}
			
			} catch (IOException e) {
			
				System.err.println("BufferedReader kapatýlýrken hata meydana geldi.");
				System.err.println("Hata : " + e);
				
			}
			
		}
		
		
		
	}
	
}
