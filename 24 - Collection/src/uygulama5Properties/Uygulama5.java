package uygulama5Properties;

import java.util.Properties;

public class Uygulama5 {
	
	public static void main(String[] args) {
		
		Properties properties = new Properties();
		
		properties.setProperty("adi", "Ferhat");
		properties.setProperty("soyadi", "Aykan");
		
		String ad = (String) properties.get("adi");
		
		System.out.println(ad); 
		
		System.out.println(properties);
	}

}
