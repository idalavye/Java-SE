package uygulama9Proje;

public class Ogrenci {
	
	private int ogrenciId;
	
	private String adi;
	
	private String soyadi;
	
	private int dogumYili;
	
	private String okulNumarasi;
	
	public Ogrenci() {
		// TODO Auto-generated constructor stub
	}

	public int getOgrenciId() {
		return ogrenciId;
	}

	public void setOgrenciId(int ogrenciId) {
		this.ogrenciId = ogrenciId;
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

	public Ogrenci(int ogrenciId, String adi, String soyadi, int dogumYili, String okulNumarasi) {	
		this.ogrenciId = ogrenciId;
		this.adi = adi;
		this.soyadi = soyadi;
		this.dogumYili = dogumYili;
		this.okulNumarasi = okulNumarasi;
	}

	@Override
	public String toString() {
		return "Ogrenci [ogrenciId=" + ogrenciId + ", adi=" + adi + ", soyadi=" + soyadi + ", dogumYili=" + dogumYili
				+ ", okulNumarasi=" + okulNumarasi + "]";
	}


}
