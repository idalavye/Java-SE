package uygulama3;

public class Adres {

	private String evNo;
	
	private String sokak;
	
	private String mahalle;
	
	private String ilce;
	
	private String sehir;
	
	public Adres() {

	}

	public Adres(String evNo, String sokak, String mahalle, String ilce, String sehir) {
		this.evNo = evNo;
		this.sokak = sokak;
		this.mahalle = mahalle;
		this.ilce = ilce;
		this.sehir = sehir;
	}

	public String getEvNo() {
		return evNo;
	}

	public void setEvNo(String evNo) {
		this.evNo = evNo;
	}

	public String getSokak() {
		return sokak;
	}

	public void setSokak(String sokak) {
		this.sokak = sokak;
	}

	public String getMahalle() {
		return mahalle;
	}

	public void setMahalle(String mahalle) {
		this.mahalle = mahalle;
	}

	public String getIlce() {
		return ilce;
	}

	public void setIlce(String ilce) {
		this.ilce = ilce;
	}

	public String getSehir() {
		return sehir;
	}

	public void setSehir(String sehir) {
		this.sehir = sehir;
	}

	@Override
	public String toString() {
		return "Adres [evNo=" + evNo + ", sokak=" + sokak + ", mahalle=" + mahalle + ", ilce=" + ilce + ", sehir="
				+ sehir + "]";
	}
	
}
