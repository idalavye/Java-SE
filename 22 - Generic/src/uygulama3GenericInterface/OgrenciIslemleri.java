package uygulama3GenericInterface;

import java.util.ArrayList;

public class OgrenciIslemleri implements Islemler<Ogrenci>{
	
	private ArrayList<Ogrenci> ogrenciler = new ArrayList<>();
	
	@Override
	public boolean kaydet(Ogrenci t) {
		
		boolean durum = ogrenciler.add(t);
		
		return durum;
	}

	@Override
	public boolean sil(Ogrenci t) {

		return ogrenciler.remove(t);
	}

	@Override
	public void listele() {

		for (Ogrenci ogrenci : ogrenciler) {
			
			System.out.println(ogrenci);
		}
	}
	
	

}
