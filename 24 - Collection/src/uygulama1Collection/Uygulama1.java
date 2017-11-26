package uygulama1Collection;

import java.util.Collection;
import java.util.HashSet;

public class Uygulama1 {

	public static void main(String[] args) {
		
		Collection<String> isimler = new HashSet<>();
		
		isimler.add("Ferhat");
		isimler.add("Ahmet");
		isimler.add("Burak");
		
		for(String isim : isimler){
			
			System.out.println(isim);
			
		}

	}
	
}
