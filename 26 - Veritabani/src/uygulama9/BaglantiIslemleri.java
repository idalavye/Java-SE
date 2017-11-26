package uygulama9;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class BaglantiIslemleri {
	

	public Connection baglantiyiAl() {
		
		Connection connection = null;
		
		try {

			Class.forName("com.mysql.jdbc.Driver");

		} catch (ClassNotFoundException e) {

			System.err.println("Mysql Driver bulunamadý.");
			System.err.println("Hata : " + e);
			
			return null;
		}

		try {

			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/calisma", "root", "12345");

			System.out.println("Baglanti Acildi");

		} catch (SQLException e) {

			System.err.println("Baglanti oluþurken bir hata oluþtu.");
			System.err.println("Hata : " + e);
			return null;
		}

		return connection;
	}
	
	public void baglantilariKapat(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet){
		
		if(connection != null){
			
			try {
				connection.close();
				
				System.out.println("Baglanti kapatýldý.");
				
			} catch (SQLException e) {
				System.err.println("Hata : " + e);
			}
		}
		
		if(preparedStatement != null){
			
			try {
				
				preparedStatement.close();
			
			} catch (SQLException e) {
				System.err.println("Hata : " + e);
			}
		}
		
		if(resultSet != null){
			
			try {
				resultSet.close();
			} catch (SQLException e) {
				
				System.err.println("Hata : " + e);
			}
		}
		
		
	}
	
	

}
