package tasarim;

import java.time.LocalDateTime;

public class Ogretmen extends Kisi{
	
	private String brans;
	
	public Ogretmen() {

	}

	public Ogretmen(int id, String adi, String soyadi, LocalDateTime dogumTarihi, String brans) {
		super(id, adi, soyadi, dogumTarihi);
		this.brans = brans;
	}

	public String getBrans() {
		return brans;
	}

	public void setBrans(String brans) {
		this.brans = brans;
	}

	@Override
	public String toString() {
		return "Ogretmen [brans=" + brans + ", getId()=" + getId() + ", getAdi()=" + getAdi() + ", getSoyadi()="
				+ getSoyadi() + ", getDogumTarihi()=" + getDogumTarihi() + "]";
	}
}
