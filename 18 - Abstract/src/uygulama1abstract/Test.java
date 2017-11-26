package uygulama1abstract;

public class Test {
	
	public static void main(String[] args) {
		
		Kare kare = new Kare(4);
		
		hesapla(kare);
		
	}

	public static void hesapla(Sekil sekil){
		
		System.out.println("Alan : " + sekil.getAlan());
	}
	
}
