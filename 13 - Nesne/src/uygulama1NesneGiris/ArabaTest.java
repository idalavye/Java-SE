package uygulama1NesneGiris;

public class ArabaTest {
	
	public static void main(String[] args) {
		
		Araba araba1; 
		
		araba1 = new Araba();
		
		araba1.marka = "Mercedes";
		araba1.model = "cla180";
		araba1.renk = "Gri";
		araba1.year = 2012;
		
		Araba araba2 = new Araba();
		
		araba2.marka = "BMW";
		araba2.model = "520d";
		araba2.renk = "Kırmızı";
		araba2.year = 2015;
			
		
		System.out.println("Araba1");
		System.out.println("Marka : " + araba1.marka);
		System.out.println("Model : " + araba1.model);
		System.out.println("Renk : " + araba1.renk);
		System.out.println("Yas : " + (2017 - araba1.year));
		
		
		System.out.println("Araba2");
		System.out.println("Marka : " + araba2.marka);
		System.out.println("Model : " + araba2.model);
		System.out.println("Renk : " + araba2.renk);
		System.out.println("Yas : " + (2017 - araba2.year));
		
	}

}
