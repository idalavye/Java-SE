package uygulama1;

public class Test {
	
	public static void main(String[] args) {
		
		Araba araba1 = new Araba("Mercedes", "CLA180", 1199, "K�rm�z�");
		Araba araba2 = new Araba("Sahin", "Tofas", 1989, "Beyaz");
		Araba araba3 = new Araba("Hac� Murat", "bilmiyorum", 2500, "Sari");
		
		ArabaIslemleri arabaIslemleri = new ArabaIslemleriImpl2();
		
		
		arabaIslemleri.arabaKaydet(araba3);
		arabaIslemleri.arabaKaydet(araba2);
		arabaIslemleri.arabaKaydet(araba1);
		
		arabaIslemleri.arabaListele();
		
	}

}
