package parametreliDegerDondermeyen;

public class ParametreliDegerDondermeyen {

	public static void main(String[] args) {
		
		
		carp(25, 12);
		
		carp(12, 17);
		
		carp(17, 255);
		
		
	}

	/*
	 * int a = 25;
	 * 
	 * int b = 35;
	 */
	public static void topla(int a, int b, int c, double d){
		
		int toplam = a + b + c;
		
		System.out.println("Toplam = " + toplam);
	}
	
	public static void carp(int a, int b){
		
		int carpim = a * b;
		
		System.out.println("Carpma sonucu : " + carpim);
	}
	
}
