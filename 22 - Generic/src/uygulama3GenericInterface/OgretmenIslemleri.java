package uygulama3GenericInterface;

import java.util.ArrayList;

public class OgretmenIslemleri implements Islemler<Ogretmen>{
	
	private ArrayList<Ogretmen> ogretmenler = new ArrayList<>();
	
	@Override
	public boolean kaydet(Ogretmen t) {
	
		boolean durum = ogretmenler.add(t);
		
		return durum;
	}

	@Override
	public boolean sil(Ogretmen t) {
		
		return ogretmenler.remove(t);
	}

	@Override
	public void listele() {

		for (Ogretmen ogretmen : ogretmenler) {
			System.out.println(ogretmen);
		}
	}

}
