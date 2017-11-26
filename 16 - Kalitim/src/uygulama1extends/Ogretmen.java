package uygulama1extends;

public class Ogretmen extends Kisi{
	
	private String brans;
	
	public String getBrans() {
		return brans;
	}

	public void setBrans(String brans) {
		this.brans = brans;
	}

	@Override
	public String toString() {
		return "Ogretmen [brans=" + brans + "]";
	}
	
	
	
}
