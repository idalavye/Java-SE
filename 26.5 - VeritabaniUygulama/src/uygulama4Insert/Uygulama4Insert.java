package uygulama4Insert;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Uygulama4Insert {

	static Connection connection = null;
	static PreparedStatement preparedStatement = null;

	public static void main(String[] args) {
		
		getConnection();
		
		String sorgu = "INSERT INTO ogrenciler(ogrenciId, adi, soyadi, dogumYili, okulNumarasi) VALUES(?, ?, ?, ?, ?)";
		
		try {
		
			preparedStatement = (PreparedStatement) connection.prepareStatement(sorgu);
			
			preparedStatement.setInt(1, 101);
			preparedStatement.setString(2, "Baki");
			preparedStatement.setString(3, "Aykan");
			preparedStatement.setInt(4, 2000);
			preparedStatement.setString(5, "3243242");
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			
			System.err.println("Hata : " + e);
			
		}
		
		finishConnection();

	}

	public static void getConnection() {

		try {

			Class.forName("com.mysql.jdbc.Driver");

		} catch (ClassNotFoundException e) {

			System.err.println("Mysql Driver Bulunamadý");
			System.err.println("Hata" + e);
			return;
		}

		try {
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/javase_vt", "root",
					"w4tchDC!iDa");
		} catch (SQLException e) {
			System.err.println("Hata" + e);
		}

		
	}

	public static void finishConnection() {
		
		if(preparedStatement != null){
			
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				System.err.println("Hata" + e);
			}
		}

		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {

				System.err.println("Hata" + e);

			}
		}

	}
}
