package parametreliDegerDondermeyen;

public class Uygulama2 {

	public static void main(String[] args) {
		/*
		mesajYaz("Ferhat", "Aykan", 22);
		
		mesajYaz("Osman", "Kaya", 25);
		
		mesajYaz("�mer", "Y�ld�z", 27);
		
		mesajYaz("", "A", 100);
		*/
		
		karakterYaz('+');
		
	}

	public static void mesajYaz(String isim, String soyisim, int yas){

		System.out.println("Merhaba");
		System.out.println("�sminiz : " + isim);
		System.out.println("Soyisminiz : " + soyisim);
		System.out.println("Yas�n�z : " + yas);
		System.out.println();
	}
	
	public static void karakterYaz(char c){
		
		System.out.println("Al�nan karakter : " + c);
	}
	
	
}
