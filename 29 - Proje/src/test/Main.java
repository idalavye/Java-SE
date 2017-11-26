package test;

import java.util.List;

import islemler.OgrenciIslemleri;
import islemler.impl.OgrenciIslemleriImpl;
import tasarim.Ogrenci;

public class Main {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
		
		
		OgrenciIslemleri ogrenciIslemleri = new OgrenciIslemleriImpl();
		
		List<Ogrenci> ogrenciler = ogrenciIslemleri.ogrencileriAl();
		
		Ogrenci ogrenci = ogrenciIslemleri.ogrenciBul(13123);
		
		
		System.out.println(ogrenci);
	}
	
}
