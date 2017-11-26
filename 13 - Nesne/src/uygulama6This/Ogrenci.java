package uygulama6This;

public class Ogrenci {
	
	private String isim;
	
	private String soyisim;
	
	private int dogumYili;
	
	private String okulNumarasi;
	
	public Ogrenci(String isim, String soyisim, int dogumYili, String okulNumarasi){
		this.isim = isim;
		this.soyisim = soyisim;
		this.dogumYili = dogumYili;
		this.okulNumarasi = okulNumarasi;
	}
	
	public void setIsim(String isim){
		
		this.isim = isim;
	}

	public String getIsim(){
		
		return isim;
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
	
}
