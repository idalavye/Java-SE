package uygulama2List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Uygulama2 {
	
	public static void main(String[] args) {
		
		/*
		 * Collection en baba interface. 
		 * 
		 * List - > içine eklenen verileri sýralý bir sekilde tutar.
		 *		- > eklenmiþ bir veri bir daha eklenebilir. 
		 * 
		 */
		
		String isim1 = "Ferhat";
		String isim2 = "Ahmet";
		String isim3 = "Burak";
		
		List<String> isimler = new ArrayList<String>();
		
		isimler.add(isim1);
		isimler.add(isim2);
		isimler.add(isim1);
		isimler.add(isim2);
		
		
		for(String isim : isimler){
			
			System.out.println(isim);
		}
		
		System.out.println("---------------");
		
		
		Iterator<String> iterator = isimler.iterator();
		
		while(iterator.hasNext()){
			
			System.out.println(iterator.next());
		}
		
		System.out.println("--------------------");
		
		boolean durum = isimler.contains(isim3);
		
		System.out.println("Ýsim 3 varmý ? " + durum);
		
		System.out.println("Boyut : " + isimler.size());		
				
	
	}

}
