package uygulama3LocalDate;

import java.time.LocalDate;
import java.time.ZoneId;

public class Uygulama3 {
	
	public static void main(String[] args) {

		//suanki tarih
		LocalDate localDate = LocalDate.now();
		
		System.out.println(localDate);
		
		LocalDate bizimTarih = LocalDate.of(2017, 6, 22);
		
		System.out.println(bizimTarih);
		
		LocalDate bugunIstanbul = LocalDate.now(ZoneId.of("Europe/Istanbul"));
		System.out.println(bugunIstanbul);
		
		LocalDate yilinXgunu = LocalDate.ofYearDay(2017, 250);
		
		System.out.println(yilinXgunu);
		
		LocalDate yeniTarih  = yilinXgunu.plusYears(3);
		
		System.out.println(yeniTarih);
		
	}

}
