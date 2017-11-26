package uygulama5;

import java.util.ArrayList;

public class Ogrenci {

	private String isim;
	
	private String soyisim;
	
	private int dogumYili;
	
	private String okulNumarasi;
	
	private ArrayList<String> dersler;
	
	public Ogrenci() {

	}

	// alt + shift + s
	public Ogrenci(String isim, String soyisim, int dogumYili, String okulNumarasi, ArrayList<String> dersler) {
		this.isim = isim;
		this.soyisim = soyisim;
		this.dogumYili = dogumYili;
		this.okulNumarasi = okulNumarasi;
		this.dersler = dersler;
	}

	public void setDersler(ArrayList<String> dersler){
		this.dersler = dersler;
	}
	
	public ArrayList<String> getDersler(){
		return dersler;
	}
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
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

	@Override
	public String toString() {
		return "Ogrenci [isim=" + isim + ", soyisim=" + soyisim + ", dogumYili=" + dogumYili + ", okulNumarasi="
				+ okulNumarasi + ", dersler=" + dersler + "]";
	}
	
}
