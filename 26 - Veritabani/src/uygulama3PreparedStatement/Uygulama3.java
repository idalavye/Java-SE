package uygulama3PreparedStatement;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Uygulama3 {
	
	public static void main(String[] args) {
		
		try {
		
			Class.forName("com.mysql.jdbc.Driver");
		
		} catch (ClassNotFoundException e) {
			
			System.err.println("Mysql Driver bulunamadý.");
			System.err.println("Hata : " + e);	
			return;
		}
		
		Connection connection = null;
		
		PreparedStatement preparedStatement = null;
		
		try {
		
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/calisma", "root", "12345");
			
			System.out.println("Basarýlý bir sekilde baglantý saglandý.");
			
			
			String sorgu = "CREATE TABLE Ogrenci(ogrenciId INT PRIMARY KEY NOT NULL, adi VARCHAR(20), soyadi VARCHAR(20), dogumYili INT, okulNumarasi VARCHAR(20))";
			
			preparedStatement = (PreparedStatement) connection.prepareStatement(sorgu);
			
			preparedStatement.execute();
		
			
		} catch (SQLException e) {

			System.err.println("Hata : " + e);
		}
		finally {
			
			if(preparedStatement != null){
				
				try {
					
					preparedStatement.close();
				
				} catch (SQLException e) {

					System.err.println("Hata : " + e);
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
