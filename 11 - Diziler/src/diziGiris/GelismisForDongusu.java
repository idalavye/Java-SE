package diziGiris;

public class GelismisForDongusu {

	public static void main(String[] args) {

		int[] sayilar = { 1, 4, 6, 2, 5, 777, 543, 5454, 54, 44, };

		int toplam = 0;
		
		for(int i : sayilar){
			toplam += i;
		}
		
		System.out.println("Toplam : " + toplam);
		
	}
	
	

}
