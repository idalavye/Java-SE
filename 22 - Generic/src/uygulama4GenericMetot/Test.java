package uygulama4GenericMetot;

public class Test {
	
	public static void main(String[] args) {
		
		Kare kare = new Kare(15);
		
		Daire daire = new Daire(15);
		
		Kare kare2 = new Kare(45);
		
		hesapla(kare);
		
		hesapla(daire);
		
		hesapla(kare2);
		
		
	}
	
	public static <T> void hesapla(T t){
		
		System.out.println(t);
		
		
	}
	
}
