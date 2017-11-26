package uygulama1SayilarArasindaki;

public class TipDonusum1 {
	
	
	/* 
	 * long 2 milyar degeri int e cevirdigimizde int'in kapasitesi hepsini alamaycagýndan veri kaybýna neden olur.
	 */
	
	public static void main(String[] args) {

		float fSayi = 55.223f;
		
		
		int iSayi = (int) fSayi;
		
		
		System.out.println("iSayinin degeri : " + iSayi);
		
		int sayi = 25;
		
		
		System.out.println("Sayi : " + sayi);
		
		
		double dSayi = (double) sayi;
		
		System.out.println("Dsayi : " + dSayi);
		
	}
	

}
