package uygulama5LocalDateTime;

import java.time.LocalDateTime;

public class Uygulama5 {

	public static void main(String[] args) {
		
		LocalDateTime localDateTime = LocalDateTime.now();
		
		System.out.println(localDateTime);
		
		LocalDateTime localDateTime2 = LocalDateTime.of(2012, 06, 22, 12, 22);
		
		System.out.println(localDateTime2);
		
	}
	

	
}
