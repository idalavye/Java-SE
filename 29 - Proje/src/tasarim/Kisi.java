package tasarim;

import java.time.LocalDateTime;

public abstract class Kisi {

	private int id;
	
	private String adi;
	
	private String soyadi;
	
	private LocalDateTime dogumTarihi;
	
	public Kisi() {

	}

	public Kisi(int id, String adi, String soyadi, LocalDateTime dogumTarihi) {
		this.id = id;
		this.adi = adi;
		this.soyadi = soyadi;
		this.dogumTarihi = dogumTarihi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public LocalDateTime getDogumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(LocalDateTime dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

	@Override
	public String toString() {
		return "Kisi [id=" + id + ", adi=" + adi + ", soyadi=" + soyadi + ", dogumTarihi=" + dogumTarihi + "]";
	}
}
