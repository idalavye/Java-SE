package uygulama6DateFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Uygulama6 {
	
	public static void main(String[] args) {
		
		LocalDateTime localDateTime = LocalDateTime.now();
		
		String sonuc = localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		
		System.out.println(sonuc);
		
	}

}
