package uygulama2;

public class Mercedes extends Araba{
	
	private String cantKalinligi;
	
	public Mercedes() {

	}

	public Mercedes(String model, String renk, double agirlik, String cantKalinligi) {
		super(model, renk, agirlik);
		this.cantKalinligi = cantKalinligi;
	}

	public String getCantKalinligi() {
		return cantKalinligi;
	}

	public void setCantKalinligi(String cantKalinligi) {
		this.cantKalinligi = cantKalinligi;
	}


	
	@Override
	public String toString() {
		return "Mercedes [cantKalinligi=" + cantKalinligi + ", Model=" + getModel() + ", Renk=" + getRenk()
				+ ", Agirlik=" + getAgirlik() + "]";
	}

	@Override
	public double kmBasiKacLtBenzin() {
		
		return getAgirlik() * 4;
	}

}
