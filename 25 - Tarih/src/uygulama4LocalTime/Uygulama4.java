package uygulama4LocalTime;

import java.time.LocalTime;

public class Uygulama4 {

	public static void main(String[] args) {
		
		LocalTime localTime = LocalTime.now();
		
		System.out.println(localTime);
		
		LocalTime belirttigimizSaat = LocalTime.of(22, 15);
		
		System.out.println(belirttigimizSaat);
		
		LocalTime saniyeIleSaatHesaplama = LocalTime.ofSecondOfDay(5000);
		
		System.out.println(saniyeIleSaatHesaplama);
		
	}
	
}
