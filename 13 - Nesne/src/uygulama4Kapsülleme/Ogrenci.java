package uygulama4Kapsülleme;

public class Ogrenci {

	private String isim;
	
	private String soyisim;
	
	private int dogumYili;
	
	private String okulNumarasi;
	
	public Ogrenci() {

	
	}
	
	public Ogrenci(String i, String s, int d, String o){
		
		isim = i;
		soyisim = s;
		dogumYili =d;
		okulNumarasi = o;
	}
	
	public void isimVer(String i){
		
		if(i.length() < 3){
			System.out.println("Uygun olmayan bir isim giriþi yapýldý. Varsayýlan olarak isminiz Kullanýcý atandý.");
			isim = "Kullanici";
		}
		else{
			isim = i;
		}
	}
	
	public String isimAl(){
		
		return isim;
	}
	
	public void soyisimVer(String s){
		
		if(s.length() < 3){
			System.out.println("Uygun olmayan bir soyisim giriþi yapýldý. Varsayýlan olarak soyisminiz Kullanýcý atandý.");
			soyisim = "Aykan";
		}
		else{
			soyisim = s;
		}
	}
	
	public String soyisimAl(){
		
		return soyisim;
	}

	public void dogumYiliVer(int i){
		
		if(i < 1900 || i > 2017){
			
			System.out.println("Uygun olmayan bir dogum tarihi giriþi yapýldý. Varsayýlan olarak 0 degeri verildi");
			i = 0;
		}
		else{
			dogumYili = i;
		}
	}
	
	public int dogumYiliAl(){
		
		return dogumYili;
	}

	public void okulNumarasiVer(String o){
		
		if(o.length() != 4){
			System.out.println("Uygun olmayan bir okul numarasi giriþi yapýldý. Varsayýlan olarak 0 degeri verildi");
			okulNumarasi = "0";
		}
		else{
			okulNumarasi = o;
		}
	}
	
	public String okulNumarasiAl(){
		
		return okulNumarasi;
	}
	
	
}
