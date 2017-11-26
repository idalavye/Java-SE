package uygulama8ToString;

public class Test {
	
	public static void main(String[] args) {
		
		Ogrenci.setOkul("Sakarya");
		
		Ogrenci ogrenci1 = new Ogrenci("Ferhat", "Aykan", 1994, "1231234");
		
		Ogrenci ogrenci2 = new Ogrenci("Ahmet", "Yýlmaz", 1992, "1231234");
		
		Ogrenci ogrenci3 = new Ogrenci("Burak", "Çelik", 1992, "1231234");
		
		//Ogrenci sýnýfýmýzsa toString kullandýðýmýz zaman, ogrenci1.bilgileriAl() gibi metot kullanmayýz
		//Direk ogrenci1, ogrenci2 gibi nesnemizi çaðýrýrýz.
		System.out.println(ogrenci1);
		
		System.out.println(ogrenci2);
		
		System.out.println(ogrenci3);
		
	}

}
