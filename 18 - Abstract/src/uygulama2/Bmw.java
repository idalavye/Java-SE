package uygulama2;

public class Bmw extends Araba{
	
	private int devirSayisi;
	
	public Bmw() {

	}

	public Bmw(String model, String renk, double agirlik, int devirSayisi) {
		super(model, renk, agirlik);
		this.devirSayisi = devirSayisi;
	}

	public int getDevirSayisi() {
		return devirSayisi;
	}

	public void setDevirSayisi(int devirSayisi) {
		this.devirSayisi = devirSayisi;
	}


	@Override
	public String toString() {
		return "Bmw [devirSayisi=" + devirSayisi + ", Model =" + getModel() + ", Renk=" + getRenk()
				+ ", Agirlik=" + getAgirlik() + "]";
	}

	@Override
	public double kmBasiKacLtBenzin() {
		
		return getAgirlik() * 3;
	}

}
