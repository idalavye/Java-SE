package uygulama1Baglanti;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Uygulama1 {
	
	public static void main(String[] args) {
		
		try {
		
			Class.forName("com.mysql.jdbc.Driver");
		
		} catch (ClassNotFoundException e) {
			
			System.err.println("Mysql Driver bulunamadı.");
			System.err.println("Hata : " + e);	
			return;
		}
		
		Connection connection = null;
		
		try {
		
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/javase_vt", "root", "12345");
			
			System.out.println("Basarılı bir sekilde baglantı saglandı.");
			
		} catch (SQLException e) {

			System.err.println("Mysql baglanamadık.");
			System.err.println("Hata : " + e);
		
		}finally {
			
			if(connection != null){
				
				try {
				
					connection.close();
				
				} catch (SQLException e) {
					
					System.err.println("Baglantı kapatılırken bir hata olustu.");
					System.err.println("Hata : " + e);
				}
				
			}
			
		}
		
	}
}
