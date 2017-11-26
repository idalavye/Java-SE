package uygulama2;

public class Test {

	public static void main(String[] args) {
		
		
		
		Ogrenci ogrenci = null;
		
		ogrenciBilgiYazdir(ogrenci);
		
		System.out.println("Deneme");
		
	}
	
	public static void ogrenciBilgiYazdir(Ogrenci ogrenci){
		
		try{
			
			System.out.println("Adi : " + ogrenci.getIsim());
			System.out.println("Soyadi : " + ogrenci.getSoyisim());
			System.out.println("Okul Numarasi : " + ogrenci.getOkulNumarasi());
			
			Adres adres = ogrenci.getAdres();
			
			System.out.println("Sokak : " + adres.getSokak());
			System.out.println("Mahalle : " + adres.getMahalle());
			System.out.println("Sehir : " + adres.getSehir());
			
		}catch (Exception e) {
			
			System.out.println("Hata : " + e.getMessage());
		}

		
	}
	
}
