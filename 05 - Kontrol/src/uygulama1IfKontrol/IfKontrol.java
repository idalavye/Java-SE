package uygulama1IfKontrol;

public class IfKontrol {
	
	public static void main(String[] args) {
		
		int sayi1 = 45;
		
		int sayi2 = 35;
		
		
		if(sayi1 > sayi2){
			
			System.out.println("Sayi1 b�y�kt�r sayi2 den");
			
			if((sayi1 - sayi2) > 5){
				
				System.out.println("Sayi1'in sayi2'den farki b�y�kt�r 5 den");
			}
			
		}
		
		if(sayi1 < sayi2){
			
			System.out.println("Sayi1 k�c�kt�r sayi2 den");
		}
		
		if(sayi1 != sayi2){
			
			System.out.println("Sayi1 esitdegil sayi2 ye");
		}
		
		if(sayi1 == sayi2){
			
			System.out.println("Sayi1 e�ittir sayi2 ye");
		}
		
		
		System.out.println("Kars�last�rma i�lemleri bitti");
		
		
	}
	

}
