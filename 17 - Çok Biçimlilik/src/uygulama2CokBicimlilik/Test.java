package uygulama2CokBicimlilik;


public class Test {
	
	public static void main(String[] args) {
		
		Ogrenci ogrenci1= new Ogrenci("Ferhat", "Aykan", 123123, "12312213", null);
		
		Ogretmen ogretmen1 = new Ogretmen("Osman", "Kaya", 1985, "Matematik");
		
		Doktor doktor = new Doktor("Hasan", "Yýldýz", 1978, "Beyin");
		
		ogrenciBilgileriniGoster(ogrenci1);
		
		System.out.println();
		
		ogretmenBilgileriGoster(ogretmen1);
		
		System.out.println();
		
		kisiBilgileriniGoster(ogretmen1);
		
		System.out.println();
		
		kisiBilgileriniGoster(ogrenci1);
		
		System.out.println("Doktor : ");
		
		kisiBilgileriniGoster(doktor);
	}
	
	public static void kisiBilgileriniGoster(Kisi kisi){
		
		System.out.println("Adi : " + kisi.getIsim());
		System.out.println("Soyadi : " + kisi.getSoyisim());
		System.out.println("Dogum yili : " + kisi.getDogumYili());
	}
	
	public static void ogrenciBilgileriniGoster(Ogrenci ogrenci){
		
		System.out.println("Adi : " + ogrenci.getIsim());
		System.out.println("Soyadi : " + ogrenci.getSoyisim());
		System.out.println("Dogum yili : " + ogrenci.getDogumYili());
		System.out.println("Okul numarasi : " +ogrenci.getOkulNumarasi());
		System.out.println("Dersleri : " +ogrenci.getDersler());
	}
	
	public static void ogretmenBilgileriGoster(Ogretmen ogretmen){
		
		System.out.println(ogretmen);
		
	}

}
