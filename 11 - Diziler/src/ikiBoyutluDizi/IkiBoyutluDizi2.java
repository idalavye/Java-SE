package ikiBoyutluDizi;

public class IkiBoyutluDizi2 {
	
	public static void main(String[] args) {
		
		
		char [][] tablo = new char[8][14];
		
		
		for(int i = 0; i < tablo.length; i++){
			
			for(int j = 0; j < tablo[i].length; j++){
				
				if(i == 0 || i == (tablo.length-1)){
					tablo[i][j] = '*';
				}
				
				else if(j == 0 || j == (tablo[i].length - 1)){
					tablo[i][j] = '*';
				}
				else if(i == j){
					
					tablo[i][j] = '#';
				}
				
				else{
					tablo[i][j] = '-';
				}
				
			}
		}
		
		
		for(int i = 0; i < tablo.length; i++){
			
			for(int j = 0; j < tablo[i].length; j++){
				
				System.out.print(tablo[i][j] + " ");
				
			}
			System.out.println();
		}
		
		
	}
	

}
