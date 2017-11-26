package uygulama7Static;

public class Ogrenci {

	private static String okul;
	
	private String isim;
	
	private String soyisim;
	
	private int dogumYili;
	
	private String okulNumarasi;
	
	public Ogrenci() {

	}
	
	public Ogrenci(String isim, String soyisim, int dogumYili, String okulNumarasi){
		this.isim = isim;
		this.soyisim = soyisim;
		this.dogumYili = dogumYili;
		this.okulNumarasi = okulNumarasi;
	}
	
	public static void setOkul(String okul){
		//this.okul dersek nesneye özel olmuþ olur bunu kabul etmez.
		//Static deðiþkenleri direk class ismiyle çaðýrabiliriz.
		Ogrenci.okul = okul;
	}
	
	public static String getOkul(){
		return okul;
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
