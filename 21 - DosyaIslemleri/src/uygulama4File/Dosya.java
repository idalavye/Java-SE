package uygulama4File;

import java.io.File;
import java.util.Date;

public class Dosya {
	
	public static void main(String[] args) {
		
		File file = new File("C:/Users/aykan/Desktop/Deneme");
			
		
		boolean calismaDurum = file.canExecute();
		
		System.out.println("CalismaDurumu : " + calismaDurum);
		
		boolean okumaDurum = file.canRead();
		
		System.out.println("OkumaDurum : " + okumaDurum);
		
		boolean yazilmaDurum = file.canWrite();
		
		System.out.println("YazilmaDurum : " + yazilmaDurum);
		
		boolean durum = file.exists();
		
		System.out.println("Dosya varmý ?   = " + durum);
		
		String path = file.getAbsolutePath();
		
		System.out.println("Path : " + path);
		
		String name = file.getName();
	
		System.out.println("Name : " + name);
		
		String parent = file.getParent();
	
		System.out.println("Parent : " + parent);
		
		long last = file.lastModified();
	
		System.out.println("Last : " + last);
		
		Date date = new Date(last);
		
		System.out.println("Date : " + date);
	
		boolean dosyamý = file.isDirectory();
		
		System.out.println("Dosya mý? degil mi ? " + dosyamý);
		
	}

}
