package uygulama3;

public class Test {

	public static void main(String[] args) {
		
		Ogrenci ogrenci1 = new Ogrenci("Ferhat", "Aykan", 1994, "213123", null);
		
		Adres adres1 = new Adres("1231", "Vakýf Sokak", "Lala Mahalasi", "Merkez", "Kütahya");
		
		ogrenci1.setAdres(adres1);
		
		
		
		Adres adres2 = new Adres("534", "Deneme Sokak", "Ptt Mahalasi", "Merkez", "Adana");
		
		Ogrenci ogrenci2 = new Ogrenci("Ahmet", "Aykan", 1912, "1231", adres2);
		
		
		bilgileriYazdir(ogrenci1);
		
		System.out.println();
		
		bilgileriYazdir(ogrenci2);
		
		
	}
		
	public static void bilgileriYazdir(Ogrenci ogr){
		System.out.println("Adi : " + ogr.getAdi());
		System.out.println("Soyadi : " + ogr.getSoyadi());
		System.out.println("Dogum yili : " +ogr.getDogumYili());
		System.out.println("Okulu : " + ogr.getOkulNumarasi());
		
		Adres adres = ogr.getAdres();
		
		System.out.println("Sehir : " + adres.getSehir());
		System.out.println("ilce : " + adres.getIlce());
		System.out.println("sokak : " +adres.getSokak());
		System.out.println("mahalle : " + adres.getMahalle());
		System.out.println("Ev no : " + adres.getEvNo());
	}
	
}
