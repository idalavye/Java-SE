package uygulama1;

public class Giris {
	
	public static void main(String[] args) {
		
		int [] sayilar = new int[5];
		
		System.out.println("Merhaba");
		
		try{
			
			System.out.println(sayilar[0]);
			
		}catch (Exception e) {

			System.out.println("Hata : " + e);
		}
		
		
		System.out.println("Selam");
		
	}

}
