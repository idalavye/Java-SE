package uygulama4InstanceOf;

public class Daire extends Sekil{

	private double yariCap;
	
	public Daire() {

	}
	
	public Daire(double yariCap){

		this.yariCap = yariCap;
	}
	
	public void setYariCap(double yariCap){
		
		this.yariCap = yariCap;
	}
	
	@Override
	public double getAlan() {

		return Math.PI * yariCap * yariCap;
	}
	
	@Override
	public double getCevre() {
	
		return 2 * Math.PI * yariCap;
	}

}
