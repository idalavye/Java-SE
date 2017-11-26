package uygulama1abstract;

public class Kare extends Sekil{

	private double kenar;
	
	public Kare(double kenar){
		this.kenar = kenar;
	}

	public double getKenar() {
		return kenar;
	}

	public void setKenar(double kenar) {
		this.kenar = kenar;
	}

	@Override
	public double getAlan() {
	
		return Math.pow(kenar, 2);
	}

	@Override
	public double getCevre() {
		return kenar*4;
	}

}
