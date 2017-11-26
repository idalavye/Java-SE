package uygulama2;

public class Araba {

	private String marka;
	
	private String model;
	
	private int üretimYili;
	
	public Araba() {

	}

	public Araba(String marka, String model, int üretimYili) {
		this.marka = marka;
		this.model = model;
		this.üretimYili = üretimYili;
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

	public int getÜretimYili() {
		return üretimYili;
	}

	public void setÜretimYili(int üretimYili) {
		this.üretimYili = üretimYili;
	}

	@Override
	public String toString() {
		return "Araba [marka=" + marka + ", model=" + model + ", üretimYili=" + üretimYili + "]";
	}
	
	
	
}
