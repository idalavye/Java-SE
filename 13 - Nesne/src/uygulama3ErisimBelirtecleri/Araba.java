package uygulama3ErisimBelirtecleri;

public class Araba {
	
	String marka;
	
	String model;
	
	int year;
	
	String renk;

	//Yapılandırıcı(Constructor)
	
	public Araba() {

	}
	
	public Araba(String m, String mo){
		
		marka = m;
		model = mo;
	}
	
	public Araba(String m, String mo, int y, String r){
		
		marka = m;
		model = mo;
		year = y;
		renk = r;
	}
	
	
}
