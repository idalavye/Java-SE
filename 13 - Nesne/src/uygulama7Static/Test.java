package uygulama7Static;

public class Test {
	
	public static void main(String[] args) {
		
		//Static tan�mlamalar b�t�n nesnelerin ortak bir �zelli�idir.
		//Static metodlar nesne olu�turmaya ihtiya� duymaz. Direk s�n�f ismiyle �a�r�labilir.
		
		Ogrenci.setOkul("Dumlup�nar");
		
		Ogrenci ogrenci1 = new Ogrenci();
		
		ogrenci1.setIsim("Ferhat");
		ogrenci1.setSoyisim("Aykan");
		
		Ogrenci ogrenci2 = new Ogrenci();
		
		ogrenci2.setIsim("Ahmet");
		ogrenci2.setSoyisim("Aykan");
		
		System.out.println("Ogrenci 1 bilgi :");
		System.out.println("Ad� : " + ogrenci1.getIsim() + ", Soyad� : " + ogrenci1.getSoyisim() + ", Okulu : " + Ogrenci.getOkul());
		
		System.out.println("Ogrenci 2 bilgi :");
		System.out.println("Ad� : " + ogrenci2.getIsim() + ", Soyad� : " + ogrenci2.getSoyisim() + ", Okulu : " + Ogrenci.getOkul());
		
		
	}

}
