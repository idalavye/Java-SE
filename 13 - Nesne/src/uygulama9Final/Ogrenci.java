package uygulama9Final;

public class Ogrenci {

	//final kulland���m�z de�i�keneri genelde b�y�k harfle yazar�z.
	public static final String OKUL = "Dumlup�nar";
	
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
	
	public void bilgileriYazdir(){
		
		System.out.println("�sim : " + isim);
		System.out.println("Soyisim : "+ soyisim);
		System.out.println("Dogum yili : " + dogumYili);
		System.out.println("Okulu : " + OKUL);
		System.out.println("Okul numarasi : " + okulNumarasi);
	}
	
	public String bilgileriAl(){
		
		return "�sim : " + isim + ", soyisim : " + soyisim + ", Dogum yili : " + dogumYili + ", Okulu : " + OKUL + ", Okul numarasi : " + okulNumarasi;
	}
	
	@Override
	public String toString() {
		
		return "�sim : " + isim + ", soyisim : " + soyisim + ", Dogum yili : " + dogumYili + ", Okulu : " + OKUL + ", Okul numarasi : " + okulNumarasi;
	}
	
}
