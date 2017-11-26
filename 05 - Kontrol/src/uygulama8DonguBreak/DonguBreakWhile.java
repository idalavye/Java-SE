package uygulama8DonguBreak;

public class DonguBreakWhile {
	
	public static void main(String[] args) {
		
		
		int a = 0;
		
		
		while(a < 10){
			
			if(a == 5){
				
				break;
			}
			
			System.out.println(a);
			
			a++;
		}
		
		System.out.println("Dongu bitti");
		
		
	}
	
}
