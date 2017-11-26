package uygulama2;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		
		Ogrenci ogrenci1 = new Ogrenci("Ferhat", "Aykan", 1994, null);
		
		Adres adres1 = new Adres("Vakýf Sokak", "Lala Hüseyin Pasa Mahallesi", "Kütahya");
		
		ogrenci1.setAdres(adres1);
		ogrenci1.setOkulNumarasi("201228");
		
		ArrayList<String> dersler = new ArrayList<>();
		dersler.add("Matematik");
		dersler.add("Fizik");
		dersler.add("Kimya");
		
		ogrenci1.setDersler(dersler);
		
		ArrayList<String> dersler2 = new ArrayList<>();
		dersler2.add("Cografya");
		dersler2.add("Tarih");
		dersler2.add("Dil anladým");
		
		Ogrenci ogrenci2 = new Ogrenci("Baki", "Aykan", 1998, adres1, "5522", dersler2);
		
		Adres adres2 = new Adres("Deneme sokak", "Meydan mah", "Kütahya");
		
		Ogrenci ogrenci3 = new Ogrenci("Enes", "Cinar", 1994, adres2, "312312", dersler);
		
		
		
		Ogretmen ogretmen1 = new Ogretmen("Hakan", "Yýlmaz", 1987, null);
		
		Adres adres3 = new Adres("Aslan sok", "Kazim mah", "Ýstanbul");
		
		ogretmen1.setAdres(adres3);
		
		KisiIslemleriImpl kisiIslemleriImpl = new KisiIslemleriImpl();
		
		kisiIslemleriImpl.kisiyiKaydet(ogretmen1);
		kisiIslemleriImpl.kisiyiKaydet(ogrenci3);
		kisiIslemleriImpl.kisiyiKaydet(ogrenci2);
		kisiIslemleriImpl.kisiyiKaydet(ogrenci1);
		
		OgrenciIslemleriImpl ogrenciIslemleriImpl = new OgrenciIslemleriImpl();
		
		ogrenciIslemleriImpl.ogrenciKaydet(ogrenci3);
		ogrenciIslemleriImpl.ogrenciKaydet(ogrenci2);
		ogrenciIslemleriImpl.ogrenciKaydet(ogrenci1);
		
		ogrenciIslemleriImpl.ogrenciListele();
		
	}

}
