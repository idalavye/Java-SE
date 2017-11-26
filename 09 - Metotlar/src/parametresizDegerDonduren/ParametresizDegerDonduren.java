package parametresizDegerDonduren;

public class ParametresizDegerDonduren {
	
	public static void main(String[] args) {
		
		int d = topla();
		
		System.out.println("Sonucunuz : " + d);
		
		int x = topla();
		
		System.out.println("Sonucunuz 2 : "+ x);
		
		double sonuc = carp();
		
		System.out.println("Carpma sonucu = " + sonuc);
		
	}
	
	public static int topla(){
		
		int a = 10;
		
		int b = 5;
		
		int toplam = a + b;
		
		return toplam;
	}

	public static double carp(){
		
		int a = 5;
		
		double b = 2.7;
		
		return a * b;
	}
	
	
}
