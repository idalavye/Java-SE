package uygulama1AritmetikOperatorler;

public class AritmetikOperator {

	public static void main(String[] args) {
		
		// = atama operat�r�
		
		int sayi1 = 26;
		
		int sayi2 = 15;
		
		
		// +  toplama operat�r� ama herzaman degil
		int toplam = sayi1 + sayi2;
		
		
		// - cikarma operat�r�
		int cikarma = sayi1 - sayi2;
		
		
		// * carpma operat�r�
		
		int carpma = sayi1 * sayi2;
		
		
		// / bolme operat�r�
		int bolme = sayi1 / sayi2;
		
		
		int mod = sayi1 % sayi2;
		
		
		float fbolme = (float) sayi1 / sayi2;
		
		System.out.println("Toplam sonuc : " + toplam);
		
		System.out.println("Cikarma sonuc : " + cikarma);
		
		System.out.println("Carpma sonuc : " + carpma);

		System.out.println("Bolme sonuc : " + bolme);
		
		System.out.println("FBolme sonuc : " + fbolme);
		
		System.out.println("Mod : " + mod);
		

	}
	
	
}
