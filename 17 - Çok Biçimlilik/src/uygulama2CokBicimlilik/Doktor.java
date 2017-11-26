package uygulama2CokBicimlilik;

public class Doktor extends Kisi{

	private String alani;
	
	public Doktor() {

	}

	public Doktor(String isim, String soyisim, int dogumYili, String alani) {
		super(isim, soyisim, dogumYili);
		this.alani = alani;
	}

	public String getAlani() {
		return alani;
	}

	public void setAlani(String alani) {
		this.alani = alani;
	}

	@Override
	public String toString() {
		return "Doktor [alani=" + alani + ", Isim=" + getIsim() + ", Soyisim=" + getSoyisim()
				+ ", DogumYili=" + getDogumYili() + "]";
	}
	
}
