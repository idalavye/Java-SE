package uygulama2Super;

import java.util.ArrayList;

public class Ogrenci extends Kisi{
	
	private String okulNumarasi;
	
	private ArrayList<String> dersler;
	
	public Ogrenci(){
		
	}
	
	public Ogrenci(String okulNumarasi, ArrayList<String> dersler){
		this.okulNumarasi = okulNumarasi;
		this.dersler = dersler;
	}
	
	public Ogrenci(String adi, String soyadi, String dogumYili) {
		super(adi, soyadi, dogumYili);
	}

	public Ogrenci(String adi, String soyadi, String dogumYili, String okulNumarasi, ArrayList<String> dersler) {
		super(adi, soyadi, dogumYili);
		this.okulNumarasi = okulNumarasi;
		this.dersler = dersler;
	}

	public String getOkulNumarasi() {
		return okulNumarasi;
	}

	public void setOkulNumarasi(String okulNumarasi) {
		this.okulNumarasi = okulNumarasi;
	}

	public ArrayList<String> getDersler() {
		return dersler;
	}

	public void setDersler(ArrayList<String> dersler) {
		this.dersler = dersler;
	}
	

}
