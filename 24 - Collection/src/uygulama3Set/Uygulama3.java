package uygulama3Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Uygulama3 {
	
	public static void main(String[] args) {
		
		/*
		 * Set - > içine ayni türden veri almaz.
		 * 	   - > içine eklenen verileri siralý bir sekilde tutmaz.
		 */
		
		Set<String> isimler = new HashSet<>();
		
		String isim1 = "Ferhat";
		String isim2 = "Ahmet";
		String isim3 = "Burak";
		
		isimler.add(isim3);
		isimler.add(isim2);
		isimler.add(isim1);
		isimler.add(isim3);
		isimler.add(isim2);
		
		Iterator<String> isimIterator = isimler.iterator();
		
		while(isimIterator.hasNext()){
			
			System.out.println(isimIterator.next());
			
		}
		
		System.out.println("-----------");
		
		for(String isim : isimler){
			
			System.out.println(isim);
		}
		
		
		
	}

}
