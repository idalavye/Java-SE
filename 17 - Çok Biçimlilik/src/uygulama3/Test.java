package uygulama3;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		
		Daire daire1 = new Daire(4.15);
		Daire daire2 = new Daire(5.12);
		
		Kare kare1 = new Kare(5);
		Kare kare2 = new Kare(3);
		
	
		
		ArrayList<Sekil> sekiller = new ArrayList<>();
		
		sekiller.add(kare2);
		sekiller.add(kare1);
		sekiller.add(daire2);
		sekiller.add(daire1);
		
		sekilBilgileriniYazdir(sekiller);
		
	}
	
	public static void alanVeCevreHesapla(Sekil sekil){
		
		System.out.println("Alaný : " + sekil.getAlan());
		System.out.println("Cevresi : " + sekil.getCevre());
		
	}
	
	public static void sekilBilgileriniYazdir(ArrayList<Sekil> sekiller){
		
		for(Sekil s : sekiller){
			
			System.out.println("Alaný : " + s.getAlan());
			System.out.println("Cevresi : " + s.getCevre());
			System.out.println();
		}
		
	}
	

}
