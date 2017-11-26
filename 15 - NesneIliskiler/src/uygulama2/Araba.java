package uygulama2;

public class Araba {

	private String marka;
	
	private String model;
	
	private int �retimYili;
	
	public Araba() {

	}

	public Araba(String marka, String model, int �retimYili) {
		this.marka = marka;
		this.model = model;
		this.�retimYili = �retimYili;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int get�retimYili() {
		return �retimYili;
	}

	public void set�retimYili(int �retimYili) {
		this.�retimYili = �retimYili;
	}

	@Override
	public String toString() {
		return "Araba [marka=" + marka + ", model=" + model + ", �retimYili=" + �retimYili + "]";
	}
	
	
	
}
