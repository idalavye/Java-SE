package uygulama2;

import java.util.ArrayList;

public class OgretmenIslemleriImpl implements OgretmenIslemleri{

	private ArrayList<Ogretmen> ogretmenler = new ArrayList<>();
	
	@Override
	public boolean ogretmenKaydet(Ogretmen ogretmen) {
		
		return ogretmenler.add(ogretmen);
	}

	@Override
	public boolean ogretmenSil(Ogretmen ogretmen) {
		
		return ogretmenler.remove(ogretmen);
	}

	@Override
	public void ogretmeniGoster(Ogretmen ogretmen) {

		System.out.println(ogretmen);
	}

}
