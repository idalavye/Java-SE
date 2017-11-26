package uygulama2;

public class Adres {
	
	private String sokak;
	
	private String mahalle;
	
	private String sehir;
	
	public Adres() {

	}

	public Adres(String sokak, String mahalle, String sehir) {
		this.sokak = sokak;
		this.mahalle = mahalle;
		this.sehir = sehir;
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

	public String getSehir() {
		return sehir;
	}

	public void setSehir(String sehir) {
		this.sehir = sehir;
	}

	@Override
	public String toString() {
		return "Adres [sokak=" + sokak + ", mahalle=" + mahalle + ", sehir=" + sehir + "]";
	}
}
