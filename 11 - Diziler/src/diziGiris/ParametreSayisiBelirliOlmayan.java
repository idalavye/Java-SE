package diziGiris;

public class ParametreSayisiBelirliOlmayan {
	
	public static void main(String[] args) {
		
		
		//elemanlariGoster(5, 15, 25, 35, 1, 3);
		
		elemanlariGosterString("Ferhat", "Ahmet", "Burak", "Hasan");
		
		
	}
	
	public static void elemanlariGosterString(String... dizi){
		
		for(String d : dizi){
			
			System.out.println(d);
			
		}
		
	}
	
	public static void elemanlariGoster(int... a){
		
		/*
		for(int i : a){
			
			System.out.println(i);
			
		}
		*/
		for(int i = 0 ;  i < a.length ; i++){
			
			System.out.println(a[i]);
			
		}
	}
	

}
