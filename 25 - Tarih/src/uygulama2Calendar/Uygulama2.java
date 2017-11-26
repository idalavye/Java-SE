package uygulama2Calendar;

import java.util.Calendar;
import java.util.Date;

public class Uygulama2 {
	
	public static void main(String[] args) {
		
		/*
		calendar.set(2018, 6, 12);
		Date date = calendar.getTime();
		System.out.println(date);
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String sonuc = dateFormat.format(date);
		System.out.println(sonuc);
		*/
		/*
		calendar.set(Calendar.YEAR, 2015);
		calendar.set(Calendar.MONTH, 6);
		calendar.set(Calendar.DAY_OF_MONTH, 22);
		
		Date date = calendar.getTime();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String sonuc = dateFormat.format(date);
		System.out.println(sonuc);
		*/
		

		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR,1994);
		calendar.set(Calendar.MONTH, 6);
		calendar.set(Calendar.DAY_OF_MONTH, 29);
		
	
		Calendar calendar2 = Calendar.getInstance();
		calendar2.set(Calendar.YEAR, 2015);
		calendar2.set(Calendar.MONTH, 6);
		calendar2.set(Calendar.DAY_OF_MONTH, 23);
		
		
		boolean durum = calendar.before(calendar2);
		
		System.out.println(durum);
		
		
		Calendar calendar3 = Calendar.getInstance();
		
		calendar3.setTime(new Date());
		
	
			
	}

}
