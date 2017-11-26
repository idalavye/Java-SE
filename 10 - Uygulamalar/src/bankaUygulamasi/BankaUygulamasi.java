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
			
			c�k�s();
		}
		else{
			
			System.out.println("Yanl�� bir secenek se�tiniz. L�tfen tekrar giri� yap�n�z.");
			
		}
		
		
	}
	
	public static void c�k�s(){
		
		System.out.println("Cikis yap�l�yor. Kendinize iyi bak�n g�r��mek dile�iyle.");
	}
	
	public static void paraYatir(){
		
		int yatirilanPara;
		
		System.out.println("Para yatirmayi se�tiniz. Hesaptaki paran�z : " + hesaptakiPara);
		
		do{
			System.out.print("Yatirmak istedi�iniz miktar : ");
			
			yatirilanPara = sc.nextInt();
			
			if(yatirilanPara < 0){
				
				System.out.println("B�yle bir para giri�i olamaz. Yeniden giriniz.");
			}
			
			System.out.println();
			
		}while(yatirilanPara < 0);
		
		hesaptakiPara = hesaptakiPara + yatirilanPara;
		
		System.out.println("Hesab�n�za para yatirildi. �uanki bakiyeniz : " + hesaptakiPara);
	}
	
	public static void paraCekme(){
		
		int cekilenPara;
		
		System.out.println("Para �ekmeyi se�tiniz. Hesaptaki paran�z : " + hesaptakiPara);
		
		do{
			
			System.out.print("�ekmek istedi�iniz tutar : " );
			
			cekilenPara = sc.nextInt();
			
			if(cekilenPara > hesaptakiPara){
				
				System.out.println("Hesab�n�zda bu kadar nakit yok. L�tfen yeniden deneyiniz.");
			}
			
		}while(cekilenPara > hesaptakiPara);
		
		hesaptakiPara = hesaptakiPara - cekilenPara;
		
		System.out.println("Hesab�n�zdan para �ekildi. �uanki bakiyeniz : " + hesaptakiPara);
		
	}
	
	public static void bakiyeSorma(){
		
		System.out.println("Hesab�n�zdaki para :" + hesaptakiPara);
	}
	
	public static String adSoyadAl(){
		
		String ad;
		
		String soyad;
		
		System.out.println("Hosgeldiniz, L�tfen ilerlemek i�in");
		
		System.out.print("Ad�n�z�  giriniz : ");
		
		ad = sc.next();
		
		System.out.print("Soyad�n�z� giriniz : ");
	
		soyad = sc.next();
		
		System.out.println();
		
		return ad + " " + soyad;
	}
	
	public static void menu(String adSoyad){
		
		System.out.println("Hosgeldin " + adSoyad );
		
		System.out.println("*MENU*");
		
		System.out.println("1 ) Para Yatirma");
		
		System.out.println("2 ) Para �ekme");
		
		System.out.println("3 ) Bakiye Sorma\n4 ) ��k��");
		
		System.out.println();
	}
	
	public static int secenekAl(){
		
		System.out.print("Bir se�enek giriniz : ");
		
		int secenek = sc.nextInt();
		
		System.out.println();
		
		return secenek;
	}
	
	public static void menuYonlendir(){
		
		System.out.println("\nMenuye y�nlendiriliyorusunuz....\n");
	}

}
