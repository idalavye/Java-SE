package uygulama2;

import java.util.ArrayList;

public class KisiIslemleriImpl implements KisiIslemleri{

	private ArrayList<Kisi> kisiler = new ArrayList<>();
	
	@Override
	public boolean kisiyiKaydet(Kisi kisi) {

		boolean durum = kisiler.add(kisi);
		
		return durum;
	}

	@Override
	public boolean kisiyiSil(Kisi kisi) {

		boolean durum = kisiler.remove(kisi);
		
		return durum;
	}

	@Override
	public void kisiBilgileriGoster(Kisi kisi) {

		System.out.println("Adi : " + kisi.getIsim());
		System.out.println("Soyadi : " + kisi.getSoyisim());
		System.out.println("Dogum yili : " + kisi.getDogumYili());
		
		Adres adres = kisi.getAdres();
		
		System.out.println("Sokak : " +  adres.getSokak());
		System.out.println("Mahalle : "  +adres.getMahalle());
		System.out.println("Sehir : " + adres.getSehir());
	}

	@Override
	public void kisiAdresBilgileriniGoster(Kisi kisi) {
		
		Adres adres = kisi.getAdres();
		
		System.out.println(kisi.getIsim() + " adlý kisinin adresi : " );
		
		System.out.println("Sokak : " +  adres.getSokak());
		System.out.println("Mahalle : "  +adres.getMahalle());
		System.out.println("Sehir : " + adres.getSehir());
		
	}

	@Override
	public void kisileriListele() {
		
		for(Kisi kisi : kisiler){
			
			System.out.println("------------------------------------------------");
			System.out.println("Adi : " + kisi.getIsim());
			System.out.println("Soyadi : " + kisi.getSoyisim());
			System.out.println("Dogum yili : " + kisi.getDogumYili());
			
			Adres adres = kisi.getAdres();
			
			System.out.println("Sokak : " +  adres.getSokak());
			System.out.println("Mahalle : "  +adres.getMahalle());
			System.out.println("Sehir : " + adres.getSehir());
			
			System.out.println("------------------------------------------------");
			
		}
		
		
	}
	
	
	
}
