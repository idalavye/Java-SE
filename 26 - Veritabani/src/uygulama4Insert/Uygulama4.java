package uygulama4Insert;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Uygulama4 {
	
	static Connection connection = null;
	
	static PreparedStatement preparedStatement = null;
	
	public static void main(String[] args) {
		
		baglantiyiAc();
		
		String sorgu = "INSERT INTO ogrenci(ogrenciId, adi, soyadi, dogumYili, okulNumarasi) VALUES(?, ?, ?, ?, ?)";
		
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
		
		baglantiyiKapat();
		
	}
	
	
	public static void baglantiyiAc(){
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
		
		} catch (ClassNotFoundException e) {
			
			System.err.println("Mysql Driver bulunamadı.");
			System.err.println("Hata : " + e);	
		}
		
		
		
		try {
			
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/calisma", "root", "12345");
		
		} catch (SQLException e) {
			
			System.err.println("Baglanti oluşurken bir hata oluştu.");
			System.err.println("Hata : " + e);
		}
	}
	
	public static void baglantiyiKapat(){
		
		if(preparedStatement != null){
			
			try {
			
				preparedStatement.close();
			
			} catch (SQLException e) {

				System.err.println("PreparedStatement kapanırken bir hata olustu.");
				System.err.println("Hata : " + e);
			}
			
		}
		
		
		if(connection != null){
			
			try {
			
				connection.close();
			
			} catch (SQLException e) {

				System.err.println("Baglanti kapatılırken bir hata olustu.");
				System.err.println("Hata : " + e);
			}
			
		}
		
	}
	
	

}
