package uygulama3;

import java.util.ArrayList;

public class OgrenciIslemleri {
	
	
	public void ogrenciBilgileriGoster(Ogrenci o){
		
		System.out.println("Adi : " + o.getAdi());
		System.out.println("Soyadi . " + o.getSoyadi());
		System.out.println("DogumYili : " + o .getDogumYili());
		System.out.println("Okulu : " + Ogrenci.getOkulu());
		System.out.println("Okul numarasi : " + o.getOkulNumarasi());
		System.out.println("Ald�g� dersler : " + o.getDersler());
	}
	
	/*
	 	dersler.add("Matematik");
		dersler.add("Fizik");
		dersler.add("Kimya");
		dersler.add("Biyoloji");
	 
	 */
	
	public void ogrenciDersArama(Ogrenci o, String ders){
		
		boolean durum = true;
		
		ArrayList<String> dersler = o.getDersler();
		
		for(String d : dersler){
			
			if(d.equals(ders)){
				
				System.out.println(o.getAdi() + " adl� ��renci bu dersi al�yor.");

				durum = false;
				
				break;
			}
			
		}
		
		if(durum){
			System.out.println(o.getAdi() + " adl� ��renci bu dersi alm�yor.");
		}
		
	}
	

}
