package uygulama4Kapsülleme;

public class Test {
	
	public static void main(String[] args) {
		
		Ogrenci ogrenci1 = new Ogrenci();
		
		ogrenci1.isimVer("Ferhat");
		
		ogrenci1.soyisimVer("Aykan");
		
		ogrenci1.okulNumarasiVer("1234");
		
		ogrenci1.dogumYiliVer(1994);

		
		System.out.println("Ogrenci 1");
		System.out.println("Ýsim : " + ogrenci1.isimAl());
		System.out.println("Soyisim : " + ogrenci1.soyisimAl());
		System.out.println("Dogum Yili: " + ogrenci1.dogumYiliAl());
		System.out.println("Okul Numarasi : " + ogrenci1.okulNumarasiAl());
		
		
		Ogrenci ogrenci2 = new Ogrenci("Baki", "Aykan", 1998, "1312");
		
		System.out.println("Ogrenci 2");
		System.out.println("Ýsim : " + ogrenci2.isimAl());
		System.out.println("Soyisim : " + ogrenci2.soyisimAl());
		System.out.println("Dogum Yili: " + ogrenci2.dogumYiliAl());
		System.out.println("Okul Numarasi : " + ogrenci2.okulNumarasiAl());
		
		
		
		
	}

}
