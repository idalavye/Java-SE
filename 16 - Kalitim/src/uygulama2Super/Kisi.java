package uygulama2Super;

public class Kisi {
	
	private String adi;
	
	private String soyadi;
	
	private String dogumYili;
	
	public Kisi() {

	}
	
	public Kisi(String adi, String soyadi){
		
		this.adi = adi;
		this.soyadi = soyadi;
	}

	public Kisi(String adi, String soyadi, String dogumYili) {
		this.adi = adi;
		this.soyadi = soyadi;
		this.dogumYili = dogumYili;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public String getDogumYili() {
		return dogumYili;
	}

	public void setDogumYili(String dogumYili) {
		this.dogumYili = dogumYili;
	}

	@Override
	public String toString() {
		return "Kisi [adi=" + adi + ", soyadi=" + soyadi + ", dogumYili=" + dogumYili + "]";
	}

}
