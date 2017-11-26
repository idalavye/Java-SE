package ikiBoyutluDizi;

public class IkiBoyutluDizi {
	
	public static void main(String[] args) {
		
		
		int [][] tablo = new int[4][7];
		
		
		for(int i = 0; i < tablo.length; i++){
			
			for(int j = 0; j < tablo[i].length; j++){
				
				tablo[i][j] = 10;
				
			}
			
		}
		
		for(int i = 0; i < tablo.length; i++){
			
			for(int j = 0; j < tablo[i].length; j++){
				
				System.out.print(tablo[i][j] + " ");
				
				
			}
			System.out.println();
		}
		
		
		
		
		/*
		for(int i = 0; i <sayilar.length ; i++){
			
			sayilar[i] = 10;
			
		}
		
		for(int i = 0; i < sayilar.length ; i++){
			
			System.out.println(sayilar[i]);
			
		}
		*/
		
		
	}

}
