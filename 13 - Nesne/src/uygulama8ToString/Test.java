package uygulama8ToString;

public class Test {
	
	public static void main(String[] args) {
		
		Ogrenci.setOkul("Sakarya");
		
		Ogrenci ogrenci1 = new Ogrenci("Ferhat", "Aykan", 1994, "1231234");
		
		Ogrenci ogrenci2 = new Ogrenci("Ahmet", "Y�lmaz", 1992, "1231234");
		
		Ogrenci ogrenci3 = new Ogrenci("Burak", "�elik", 1992, "1231234");
		
		//Ogrenci s�n�f�m�zsa toString kulland���m�z zaman, ogrenci1.bilgileriAl() gibi metot kullanmay�z
		//Direk ogrenci1, ogrenci2 gibi nesnemizi �a��r�r�z.
		System.out.println(ogrenci1);
		
		System.out.println(ogrenci2);
		
		System.out.println(ogrenci3);
		
	}

}
