package uygulama2StringSayiDonusumleri;

public class TipDonusum2 {

	public static void main(String[] args) {
		
		String sayi1 = "15";
		
		String sayi2 = "42";
		
		int sayi1Donusum = Integer.parseInt(sayi1);
		
		int sayi2Donusum = Integer.parseInt(sayi2);
		
		
		int toplam = sayi1Donusum + sayi2Donusum;
		
		
		System.out.println("Toplam : " + toplam);
		
		
		int sayi3Donusum = Integer.valueOf(sayi1);
		
		int sayi4Donusum = Integer.valueOf(sayi2);

		toplam = sayi3Donusum + sayi4Donusum;
		
		System.out.println("Toplam2 = " + toplam);
		
	}
	
}
