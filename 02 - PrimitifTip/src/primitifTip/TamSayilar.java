package primitifTip;

public class TamSayilar {
	
	public static void main(String[] args) {
		
		/*
		 * Primitif tipler haf�zada belirtildi�i alan kadar yer kaplar
		 * 
		 * Tam Sayilar : byte - short - int - long
		 * 
		 * Ondal�k sayilar : float - double
		 * 
		 * Tek karakter : char (%, & , a, b, 9 , *)
		 * 
		 * Durum : boolean ( true, false)
		 * 
		 */
		
		/*
		 * Byte haf�zada 8 bit lik bir alan kaplar.
		 * 
		 * -128, +128
		 */
		byte bSayi = 15;
		
	
		/*
		 * 
		 * Short haf�zada 16 bit lik bir alan kaplar
		 * 
		 * -2^15, + 2^15
		 * 
		 */
		short sSayi = 25;
		
		
		/*
		 * int haf�zada 32 bit lik bir alan  kaplar
		 * 
		 * -2^31 , +2^31
		 */
		int iSayi = 2524;
			
		 
		
		/*
		 * long haf�zada 64 bit lik bir alan kaplar
		 * 
		 * -2^63 , +2^63 yaklas�k 2 milyar 
		 */
		
		long lSayi = 5555555;
		
		
		System.out.println(bSayi);
		System.out.println("bSayinin degeri : " + bSayi);
		
		System.out.println("sSayinin deger : " + sSayi);
		
		System.out.println("iSayinin deger : " + iSayi);
		
		System.out.println("iSayinin deger : " + lSayi);
		
		
		
	}
	

}
