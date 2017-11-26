package uygulama6Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Uygulama2 {

	// ctrl a ile tüm kodlar secilir. ctrl + shift + f ile düzenlenir.

	public static void main(String[] args) {

		

		try(BufferedReader bufferedReader =  new BufferedReader(new FileReader("C:/Users/aykan/Desktop/deneme.txt"))) {

			String satir;

			while ((satir = bufferedReader.readLine()) != null) {

				System.out.println(satir);
			}
			/*
			 * while(true){
			 * 
			 * satir = bufferedReader.readLine();
			 * 
			 * if(satir == null){ break; } else{ System.out.println(satir); } }
			 */

		} catch (IOException e) {

			System.err.println("Hata : " + e);

		}

	}

}
