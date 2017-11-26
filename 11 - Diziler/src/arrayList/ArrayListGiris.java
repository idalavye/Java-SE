package arrayList;

import java.util.ArrayList;

public class ArrayListGiris {
	
	public static void main(String[] args) {
		
		ArrayList<String> dersListesi = new ArrayList<String>();
		
		/*
		 * 	add(dizi hangi türdeyse onun türünde eleman eklenir buraya)
		 * 	remove
		 * 	get
		 *	indexOf 
		 */
		
		dersListesi.add("Matematik");
		dersListesi.add("Fizik");
		dersListesi.add("Kimya");
		
		
		for(String ders : dersListesi){
			
			System.out.println(ders);
		}
		
		
		dersListesi.remove(1);
		System.out.println("----");
		
		for(int i = 0; i < dersListesi.size() ; i++){
			
			System.out.println(dersListesi.get(i));
			
		}
	
	}
	
}
