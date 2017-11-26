package uygulama3;

public class Ogrenci {

	private String adi;
	
	private String soyadi;
	
	private int dogumYili;

	private String okulNumarasi;
	
	private Adres adres;

	public Ogrenci() {

	}

	public Ogrenci(String adi, String soyadi, int dogumYili, String okulNumarasi, Adres adres) {
		this.adi = adi;
		this.soyadi = soyadi;
		this.dogumYili = dogumYili;
		this.okulNumarasi = okulNumarasi;
		this.adres = adres;
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

	public int getDogumYili() {
		return dogumYili;
	}

	public void setDogumYili(int dogumYili) {
		this.dogumYili = dogumYili;
	}

	public String getOkulNumarasi() {
		return okulNumarasi;
	}

	public void setOkulNumarasi(String okulNumarasi) {
		this.okulNumarasi = okulNumarasi;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	@Override
	public String toString() {
		return "Ogrenci [adi=" + adi + ", soyadi=" + soyadi + ", dogumYili=" + dogumYili + ", okulNumarasi="
				+ okulNumarasi + ", adres=" + adres + "]";
	}
	
}
