package uygulama5KapsüllemeSetGet;

public class Test {
	
	public static void main(String[] args) {
		
		Ogrenci ogrenci1 = new Ogrenci();
		Ogrenci ogrenci2 = new Ogrenci();
		
		ogrenci1.setIsim("Ferhat");
		ogrenci1.setSoyisim("Aykan");
		ogrenci1.setOkulNumarasi("2500");
		ogrenci1.setDogumYili(1994);
		
		ogrenci2.setIsim("Ahmet");
		ogrenci2.setSoyisim("Yýlmaz");
		ogrenci2.setOkulNumarasi("6522");
		ogrenci2.setDogumYili(1998);
		
		
		System.out.println("Ýsim : " + ogrenci1.getIsim());
		System.out.println("Soyisim : " + ogrenci1.getSoyisim());
		System.out.println("Okul Numarasi : " + ogrenci1.getOkulNumarasi());
		System.out.println("Dogum yili : " + ogrenci1.getDogumYili());
		
		
		System.out.println( "Ýsim : " + ogrenci2.getIsim() + 	
							", Soyisim : " + ogrenci2.getSoyisim() + 
							", Okul numarasi : " + ogrenci2.getOkulNumarasi() + 
							", Dogum yili : " + ogrenci2.getDogumYili());
		
	}

}
