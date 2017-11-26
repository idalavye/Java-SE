package uygulama2Constructor;

public class ArabaTest {
	
	public static void main(String[] args) {
		
		Araba araba1 = new Araba("Mercedes", "CLA180", 2012, "Kırmızı");
		
		System.out.println("Araba1");
		System.out.println("Marka : " + araba1.marka);
		System.out.println("Model : " + araba1.model);
		System.out.println("Renk : " + araba1.renk);
		System.out.println("Year : " + araba1.year);
		
		System.out.println();
		
		Araba araba2 = new Araba("BMW", "520d", 2015, "Mavi");
		
		System.out.println("Araba2");
		System.out.println("Marka : " + araba2.marka);
		System.out.println("Model : " + araba2.model);
		System.out.println("Renk : " + araba2.renk);
		System.out.println("Year : " + araba2.year);
		
		Araba araba3 = new Araba("Pegeout", "305");
		araba3.renk = "Kırmızı";
		araba3.year = 2011;
		
		System.out.println(araba3.renk);
		
		
	}

}
