package uygulama3IfThenElse;

public class IfThenElse {
	
	public static void main(String[] args) {
		
		int a = 20;
		
		int b = 0;
		
		String sonuc;
		
		boolean durum;
		
		b = (a > 10) ? 20 : 5;
		
		
		sonuc = (a > 10) ? "Büyük" : "Kücük";
		
		durum = (a > 10) ? true : false;
		
		
		System.out.println("B nin degeri : " + b);
		
		System.out.println("Sonuc : " + sonuc);
		
		System.out.println("Durum : " + durum);
		
		
	}

}
