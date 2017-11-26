package uygulama2;

public class Test {
	
	public static void main(String[] args) {
		
		Bmw bmw1 = new Bmw("520d", "Kýrmýzý", 2500, 500);
		Bmw bmw2 = new Bmw("318i", "gri", 1500, 300);
		
		//Mercedes mercedes = new Mercedes("CLA180", "Beyaz", 3500, "25");
		
		bmwBilgiGoster(bmw2);
		
		bmwBilgiGoster(bmw1);
		
	
	}
	
	public static void bilgileriGoruntule(Araba araba){
		
		System.out.println("Model : " + araba.getModel());
		System.out.println("Renk : " + araba.getRenk());
		System.out.println("Agirlik : " + araba.getAgirlik());
		System.out.println("Km de ml benzin yaktýgý : " +araba.kmBasiKacLtBenzin());
	}
	
	public static void bmwBilgiGoster(Bmw bmw){
		System.out.println("Model : " + bmw.getModel());
		System.out.println("Renk : " + bmw.getRenk());
		System.out.println("Agirlik : " + bmw.getAgirlik());
		System.out.println("Km de ml benzin yaktýgý : " +bmw.kmBasiKacLtBenzin());
		System.out.println("Devir sayisi : " + bmw.getDevirSayisi());
	}
	public static void mercedesBilgiGoster(Mercedes mercedes){
		
		System.out.println("Model : " + mercedes.getModel());
		System.out.println("Renk : " + mercedes.getRenk());
		System.out.println("Agirlik : " + mercedes.getAgirlik());
		System.out.println("Km de ml benzin yaktýgý : " +mercedes.kmBasiKacLtBenzin());
		System.out.println("Cant Kalýnglýgý : " + mercedes.getCantKalinligi());
	}
}
