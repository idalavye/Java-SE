package uygulama2Statement;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Uygulama2 {

	public static void main(String[] args) {
		
		try {
		
			Class.forName("com.mysql.jdbc.Driver");
		
		} catch (ClassNotFoundException e) {
			
			System.err.println("Mysql Driver bulunamadý.");
			System.err.println("Hata : " + e);	
			return;
		}
		
		Connection connection = null;
		Statement statement = null;
		
		try {
		
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/calisma", "root", "12345");
			
			System.out.println("Basarýlý bir sekilde baglantý saglandý.");

			statement = (Statement) connection.createStatement();
			
			String sorgu = "CREATE TABLE Ogrenci(ogrenciId INT PRIMARY KEY NOT NULL, adi VARCHAR(20), soyadi VARCHAR(20), dogumYili INT, okulNumarasi VARCHAR(20))";
			
			statement.execute(sorgu);
			
		} catch (SQLException e) {

			System.err.println("Hata : " + e);
		}
		finally {
			
			if(statement != null){
				
				try {
				
					statement.close();
				
				} catch (SQLException e) {
					
					System.err.println("Statement kapatýlýrken bir hata ile karsýlastýk");
				}
			}
			if(connection != null){
				
				try {
					
					connection.close();
				
				} catch (SQLException e) {
					System.err.println("Connection kapatýlýrken bir hata ile karsýlastýk");
				}
				
			}
		}
		
	}
	
}
