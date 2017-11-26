package uygulama1giris;

public class Daire implements Sekil{
	/*
	 * cevre : 2 * pi * r
	 * alaný : pi * r * r
 	 */
	
	private final double PI = 3.14;
	
	private double r;

	public Daire() {

	}
	
	public Daire(double r) {
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double alanHesapla() {
	
		return PI*r*r;
	}

	@Override
	public double cevreHesapla() {
		
		return 2*PI*r;
	}

}
