package uygulama2CokBicimlilik;

public class Ogretmen extends Kisi{

	private String brans;
	
	public Ogretmen() {

	}

	public Ogretmen(String isim, String soyisim, int dogumYili) {
		super(isim, soyisim, dogumYili);
	}

	public Ogretmen(String isim, String soyisim, int dogumYili, String brans) {
		super(isim, soyisim, dogumYili);
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
		return "Ogretmen [brans=" + brans + ", isim =" + getIsim() + ", soyisim=" + getSoyisim()
				+ ", dogum yili=" + getDogumYili() + "]";
	}
}
