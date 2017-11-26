package parametreliDegerDonduren;

public class Uygulama4 {
	
	public static void main(String[] args) {
		
		int sonucm = max(20, 10);
		
		System.out.println("Sonuc Max: " + sonucm);
		
		
		int sonucMin = min(15, 17);
		
		System.out.println("Sonuc Min : " + sonucMin);
		
		
	}
	
	public static int max(int a, int b){
		
		if( a > b){
			
			return a;
		}
		else{
			return b;
		}
	}
	public static int min(int a, int b){
		
		return (a < b) ? a : b;
		
	}
	
	

}
