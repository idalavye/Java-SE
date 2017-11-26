package parametresizDegerDonduren;

public class Uygulama2 {
	
	public static void main(String[] args) {
		
		boolean durum = karsilastir();
		
		System.out.println("Karsılastırma durumu : " + durum );
		
		
	}

	public static boolean karsilastir(){
		
		int a = 20;
		
		int b = 15;
		
		if(a > b){
			
			return true;
		}
		else{
			return false;
		}
		
	}
	
	
}
