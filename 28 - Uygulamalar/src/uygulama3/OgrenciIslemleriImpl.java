package uygulama3;

import java.util.ArrayList;

public class OgrenciIslemleriImpl implements OgrenciIslemleri{
	
	private ArrayList<Ogrenci> ogrenciler = new ArrayList<>();
	
	@Override
	public void ogrenciKaydet(Ogrenci ogrenci) {
		
		ogrenciler.add(ogrenci);
	}

	@Override
	public void ogrenciSil(Ogrenci ogrenci) {
		
		ogrenciler.remove(ogrenci);
	}

	@Override
	public ArrayList<Ogrenci> ogrenciListele() {

		return ogrenciler;
	}
	
	// ferhat
	// Ferhat
	
	@Override
	public Ogrenci ogrenciBul(String adi) {
		
		for(Ogrenci ogrenci : ogrenciler){
			
			if(ogrenci.getAdi().equalsIgnoreCase(adi)){
				return ogrenci;
			}
		}
		return null;
	}

}
