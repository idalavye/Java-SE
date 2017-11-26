package uygulamalar;

public class Uygulama4 {
	
	public static void main(String[] args) {
		
		int a = 0;
		
		int toplam = 0;
		
		do{
		
			toplam = toplam + a;
			
			// toplam += a;
			
			a++;
		}while(a <= 50);
		
		System.out.println(toplam);
		
		
	}

}
