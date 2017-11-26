package tasarim;

import java.time.LocalDateTime;

public class Ogrenci extends Kisi{
	
	private String okulNumarasi;
	
	public Ogrenci() {

	}

	public Ogrenci(int id, String adi, String soyadi, LocalDateTime dogumTarihi, String okulNumarasi) {
		super(id, adi, soyadi, dogumTarihi);
		this.okulNumarasi = okulNumarasi;
	}

	public String getOkulNumarasi() {
		return okulNumarasi;
	}

	public void setOkulNumarasi(String okulNumarasi) {
		this.okulNumarasi = okulNumarasi;
	}

	@Override
	public String toString() {
		return getAdi() + " " + getSoyadi();
	}
}
