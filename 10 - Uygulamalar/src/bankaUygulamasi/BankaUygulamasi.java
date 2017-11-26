package bankaUygulamasi;

import java.util.Scanner;

public class BankaUygulamasi {
	
	static Scanner sc = new Scanner(System.in);
	
	static int hesaptakiPara = 0;
	
	public static void main(String[] args) {
		
		String adSoyad;
		
		int secenek;
		
		adSoyad = adSoyadAl();
		
		do{
			
			menu(adSoyad);
			
			secenek = secenekAl();
			
			secenekKontrol(secenek);
			
			if(secenek == 4){
				
				break;
			}
			menuYonlendir();
			
		}while(secenek != 4);
		
		
	}
	
	public static void secenekKontrol(int secenek){
		
		if(secenek == 1){
			
			paraYatir();
			
		}
		else if(secenek == 2){
			
			paraCekme();
			
		}
		else if(secenek == 3){
			
			bakiyeSorma();
			
		}
		else if(secenek == 4){
			
			cýkýs();
		}
		else{
			
			System.out.println("Yanlýþ bir secenek seçtiniz. Lütfen tekrar giriþ yapýnýz.");
			
		}
		
		
	}
	
	public static void cýkýs(){
		
		System.out.println("Cikis yapýlýyor. Kendinize iyi bakýn görüþmek dileðiyle.");
	}
	
	public static void paraYatir(){
		
		int yatirilanPara;
		
		System.out.println("Para yatirmayi seçtiniz. Hesaptaki paranýz : " + hesaptakiPara);
		
		do{
			System.out.print("Yatirmak istediðiniz miktar : ");
			
			yatirilanPara = sc.nextInt();
			
			if(yatirilanPara < 0){
				
				System.out.println("Böyle bir para giriþi olamaz. Yeniden giriniz.");
			}
			
			System.out.println();
			
		}while(yatirilanPara < 0);
		
		hesaptakiPara = hesaptakiPara + yatirilanPara;
		
		System.out.println("Hesabýnýza para yatirildi. Þuanki bakiyeniz : " + hesaptakiPara);
	}
	
	public static void paraCekme(){
		
		int cekilenPara;
		
		System.out.println("Para çekmeyi seçtiniz. Hesaptaki paranýz : " + hesaptakiPara);
		
		do{
			
			System.out.print("Çekmek istediðiniz tutar : " );
			
			cekilenPara = sc.nextInt();
			
			if(cekilenPara > hesaptakiPara){
				
				System.out.println("Hesabýnýzda bu kadar nakit yok. Lütfen yeniden deneyiniz.");
			}
			
		}while(cekilenPara > hesaptakiPara);
		
		hesaptakiPara = hesaptakiPara - cekilenPara;
		
		System.out.println("Hesabýnýzdan para çekildi. Þuanki bakiyeniz : " + hesaptakiPara);
		
	}
	
	public static void bakiyeSorma(){
		
		System.out.println("Hesabýnýzdaki para :" + hesaptakiPara);
	}
	
	public static String adSoyadAl(){
		
		String ad;
		
		String soyad;
		
		System.out.println("Hosgeldiniz, Lütfen ilerlemek için");
		
		System.out.print("Adýnýzý  giriniz : ");
		
		ad = sc.next();
		
		System.out.print("Soyadýnýzý giriniz : ");
	
		soyad = sc.next();
		
		System.out.println();
		
		return ad + " " + soyad;
	}
	
	public static void menu(String adSoyad){
		
		System.out.println("Hosgeldin " + adSoyad );
		
		System.out.println("*MENU*");
		
		System.out.println("1 ) Para Yatirma");
		
		System.out.println("2 ) Para Çekme");
		
		System.out.println("3 ) Bakiye Sorma\n4 ) Çýkýþ");
		
		System.out.println();
	}
	
	public static int secenekAl(){
		
		System.out.print("Bir seçenek giriniz : ");
		
		int secenek = sc.nextInt();
		
		System.out.println();
		
		return secenek;
	}
	
	public static void menuYonlendir(){
		
		System.out.println("\nMenuye yönlendiriliyorusunuz....\n");
	}

}
