package uygulama2;

import java.util.ArrayList;

public class Ogrenci {

	private String adi;
	
	private String soyadi;
	
	private int dogumYili;
	
	private ArrayList<String> telefonNumaralari;
	
	private String okulNumarasi;
	
	private static String okul;
	
	private ArrayList<String> dersler;
	
	private Adres adres;
	
	private ArrayList<Araba> arabalar;
	
	public Ogrenci() {

	}

	public Ogrenci(String adi, String soyadi, int dogumYili, String okulNumarasi) {
		this.adi = adi;
		this.soyadi = soyadi;
		this.dogumYili = dogumYili;
		this.okulNumarasi = okulNumarasi;
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

	public int getDogumYili() {
		return dogumYili;
	}

	public void setDogumYili(int dogumYili) {
		this.dogumYili = dogumYili;
	}

	public ArrayList<String> getTelefonNumaralari() {
		return telefonNumaralari;
	}

	public void setTelefonNumaralari(ArrayList<String> telefonNumaralari) {
		this.telefonNumaralari = telefonNumaralari;
	}

	public String getOkulNumarasi() {
		return okulNumarasi;
	}

	public void setOkulNumarasi(String okulNumarasi) {
		this.okulNumarasi = okulNumarasi;
	}

	public static String getOkul() {
		return okul;
	}

	public static void setOkul(String okul) {
		Ogrenci.okul = okul;
	}

	public ArrayList<String> getDersler() {
		return dersler;
	}

	public void setDersler(ArrayList<String> dersler) {
		this.dersler = dersler;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	public ArrayList<Araba> getArabalar() {
		return arabalar;
	}

	public void setArabalar(ArrayList<Araba> arabalar) {
		this.arabalar = arabalar;
	}

	@Override
	public String toString() {
		return "Ogrenci [adi=" + adi + ", soyadi=" + soyadi + ", dogumYili=" + dogumYili + ", telefonNumaralari="
				+ telefonNumaralari + ", okulNumarasi=" + okulNumarasi + ", dersler=" + dersler + ", adres=" + adres
				+ ", arabalar=" + arabalar + "]";
	}
}
