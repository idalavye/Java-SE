package stringMetotlari;

public class StringKarsilastirma3BuyukluKucuklu {
	
	public static void main(String[] args) {
			
		String isim1 = "Ferhat";
		
		String isim2 = "ferhat";
		
		if(isim1.equalsIgnoreCase(isim2)){
			
			System.out.println("�simler birbirine e�ittir.");
		}
		
		else{
			
			System.out.println("�simler e�it de�ildir");
		}
		
	}
	
}
