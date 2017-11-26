package veritabaniBaglanti;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class VeritabaniBaglanti {
	
	public Connection baglantiyiAl(){

		Connection connection = null;
		
		try {

			Class.forName("com.mysql.jdbc.Driver");

		} catch (ClassNotFoundException e) {

			System.err.println("Mysql Driver bulunamad�.");
			System.err.println("Hata : " + e);
			
			return null;
		}

		try {

			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/calisma", "root", "12345");


		} catch (SQLException e) {

			System.err.println("Baglanti olu�urken bir hata olu�tu.");
			System.err.println("Hata : " + e);
			return null;
		}

		return connection;
	}
	
	public void baglantilariKapat(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet){
		
		if(connection != null){
			
			try {
				connection.close();
				
			} catch (SQLException e) {
				
				System.err.println("Baglant� kapat�l�rken bir hata ald�k.");
			}
		}
		
		if(preparedStatement != null){
			
			try {
				preparedStatement.close();
		
			} catch (SQLException e) {
				
				System.err.println("preparedStatement kapat�l�rken bir hata ald�k.");
			}
		}
		
		if(resultSet != null){
			
			try {
				resultSet.close();
			} catch (SQLException e) {
				
				System.err.println("resultSet kapat�l�rken bir hata ald�k.");
		
			}
		}
		
		
	}

}
