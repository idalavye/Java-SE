package parametreliDegerDonduren;

public class ParametreliDegerDonduren {
	
	public static void main(String[] args) {
		
		double d = carp(2.7f, 5.3f);

		System.out.println("Carpma sonucu : " + d);
		
		d = carp(2.8f, 12.7f);
		
		System.out.println("Carpma sonucu 2 : " + d);
		
		double b = bol(5, 3);
		
		System.out.println("Bolme sonucu : " + b);
		
		b = bol(52, 27);
		
		System.out.println("Bolme sonucu 2 : " + b);
		
		int t = topla(10, 25);
		
		System.out.println("Toplam sonucu : " + t);
		
		t = topla(12, 5);
		
		System.out.println("Toplam sonucu 2 : " + t);
		

		
	}

	public static int topla(float a, float b){
		
		int toplam = (int)(a+b);
		
		return toplam;
	}
	
	public static double carp(float a, float b){
		
		return a * b;
	}
	
	public static double bol(int a, int b){
		
		return (double)(a/b);
	}
	
}
