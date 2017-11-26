package uygulama2GenericExtends;

public class Ogrenci extends Kisi{

	private String okulNumarasi;
	
	public Ogrenci() {

	}

	public Ogrenci(String adi, String soyadi, int dogumYili) {
		super(adi, soyadi, dogumYili);
	}

	public Ogrenci(String adi, String soyadi, int dogumYili, String okulNumarasi) {
		super(adi, soyadi, dogumYili);
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
		return "Ogrenci [okulNumarasi=" + okulNumarasi + ", Adi=" + getAdi() + ", Soyadi=" + getSoyadi()
				+ ", DogumYili=" + getDogumYili() + "]";
	}
	
	
	
}
