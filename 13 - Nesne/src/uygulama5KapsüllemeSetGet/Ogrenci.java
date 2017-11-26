package uygulama5KapsüllemeSetGet;

public class Ogrenci {
	
	private String isim;
	
	private String soyisim;
	
	private int dogumYili;
	
	private String okulNumarasi;
	
	public void setIsim(String i){
		isim = i;
	}
	
	public String getIsim(){
		return isim;
	}
	
	public void setSoyisim(String s){
		soyisim = s;
	}
	
	public String getSoyisim(){
		return soyisim;
	}
	
	public void setDogumYili(int d){
		dogumYili = d;
	}
	
	public int getDogumYili(){
		return dogumYili;
	}
	
	public void setOkulNumarasi(String o){
		okulNumarasi = o;
	}
	
	public String getOkulNumarasi(){
		return okulNumarasi;
	}

}
