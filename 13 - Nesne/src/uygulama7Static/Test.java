package uygulama7Static;

public class Test {
	
	public static void main(String[] args) {
		
		//Static tanýmlamalar bütün nesnelerin ortak bir özelliðidir.
		//Static metodlar nesne oluþturmaya ihtiyaç duymaz. Direk sýnýf ismiyle çaðrýlabilir.
		
		Ogrenci.setOkul("Dumlupýnar");
		
		Ogrenci ogrenci1 = new Ogrenci();
		
		ogrenci1.setIsim("Ferhat");
		ogrenci1.setSoyisim("Aykan");
		
		Ogrenci ogrenci2 = new Ogrenci();
		
		ogrenci2.setIsim("Ahmet");
		ogrenci2.setSoyisim("Aykan");
		
		System.out.println("Ogrenci 1 bilgi :");
		System.out.println("Adý : " + ogrenci1.getIsim() + ", Soyadý : " + ogrenci1.getSoyisim() + ", Okulu : " + Ogrenci.getOkul());
		
		System.out.println("Ogrenci 2 bilgi :");
		System.out.println("Adý : " + ogrenci2.getIsim() + ", Soyadý : " + ogrenci2.getSoyisim() + ", Okulu : " + Ogrenci.getOkul());
		
		
	}

}
