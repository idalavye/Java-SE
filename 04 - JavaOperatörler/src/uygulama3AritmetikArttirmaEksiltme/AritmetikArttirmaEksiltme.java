package uygulama3AritmetikArttirmaEksiltme;

public class AritmetikArttirmaEksiltme {
	
	public static void main(String[] args) {
		
		int sayi1 = 25;
		
		int sayi2 = 35;
				
		int sonuc = sayi1++ + sayi2++;
		
		System.out.println("Sonuc : " + sonuc);
		
		
		sonuc = sayi1 + sayi2;
		
		System.out.println("Sonuc : " + sonuc );
		
		sayi1++ ;
		
		++sayi2;
	
		
	}

}
