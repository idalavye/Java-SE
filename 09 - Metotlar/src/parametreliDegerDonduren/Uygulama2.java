package parametreliDegerDonduren;

public class Uygulama2 {
	
	public static void main(String[] args) {
		
		boolean d = karsilastir(5, 3);
		
		System.out.println(d);
		
		d = karsilastir(15, 17);
		
		System.out.println("2. sonuc : " + d);
		
		
		
	}
	
	public static boolean karsilastir(int a, int b){
		
	
		boolean durum = (a > b) ? true : false;
		
		return durum;
		
	}
	
	

}
