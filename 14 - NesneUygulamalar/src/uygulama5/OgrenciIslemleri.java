package uygulama5;

import java.util.ArrayList;

public class OgrenciIslemleri {
	
	private static ArrayList<Ogrenci> ogrenciler = new ArrayList<>();

	
	public void ogrenciEkle(Ogrenci ogrenci){
		
		boolean durum = ogrenciler.add(ogrenci);
		
		if(durum){
			System.out.println(ogrenci.getIsim() + " adlý öðrenci baþarýlý bir þekilde listeye eklendi.");
		}
		else{
			System.out.println(ogrenci.getIsim() + " adlý öðrenci eklenirken bir hata oluþtu.");
		}
		
	}
	
	public void ogrenciSil(Ogrenci ogrenci){
		
		boolean durum = ogrenciler.remove(ogrenci);
	
		if(durum){
			System.out.println("Öðrenci baþarýlý bir þekilde listeden silindi.");
		}
		else{
			System.out.println("Öðrenci silinirken bir hata oluþtu.");
		}
		
	}
	
	public void ogrenciListele(){
		
		for(Ogrenci ogrenci : ogrenciler){
			
			System.out.println(ogrenci);
		}
		
	}
	
	
	public ArrayList<Ogrenci> getOgrenciler(){
		return ogrenciler;
	}
	
	
}
