package uygulama3GenericInterface;

public class Test {

	public static void main(String[] args) {
		
		Ogrenci ogrenci1 = new Ogrenci("Ýbrahim", "Daðdelen", 1997, "564564");
		Ogrenci ogrenci2 = new Ogrenci("Ferhat", "Aykan", 1997, "45656");
		
		OgrenciIslemleri islemleri = new OgrenciIslemleri();
		islemleri.kaydet(ogrenci1);
		islemleri.kaydet(ogrenci2);
		
		islemleri.listele();
		
	}
}
