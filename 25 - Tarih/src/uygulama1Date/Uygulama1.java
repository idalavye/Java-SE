package uygulama1Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Uygulama1 {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println(date);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		
		String sonuc = dateFormat.format(date);
		
		System.out.println(sonuc);
		
	}
}
