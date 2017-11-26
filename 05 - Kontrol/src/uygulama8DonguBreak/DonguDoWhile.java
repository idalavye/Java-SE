package uygulama8DonguBreak;

public class DonguDoWhile {
	
	public static void main(String[] args) {
		
		int a = 0;
		
		do{
			
			System.out.println("A : " + a);
			a++;
			
			if(a == 7){
				
				break;
			}
			
		}while(a < 10);
		
		
		
	}

}
