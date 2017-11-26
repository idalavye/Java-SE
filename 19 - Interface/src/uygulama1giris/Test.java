package uygulama1giris;

public class Test {

	public static void main(String[] args) {
		
		Daire daire = new Daire(3.15);
		
		Kare kare = new Kare(5);
		
		alanVeCevreYazdir(kare);
		
		dairebilgileriYazdir(daire);
		
	}	
	
	public static void alanVeCevreYazdir(Sekil sekil){
		
		System.out.println("Alaný : " + sekil.alanHesapla());
		System.out.println("Cevre : " + sekil.cevreHesapla());
	}
	
	public static void dairebilgileriYazdir(Daire daire){
		
		System.out.println("Daire bilgileri : " );
		
		System.out.println("YariCapi : " + daire.getR());
		System.out.println("Alaný : " + daire.alanHesapla());
		System.out.println("Cevresi : " + daire.cevreHesapla());	
	}
	
}
