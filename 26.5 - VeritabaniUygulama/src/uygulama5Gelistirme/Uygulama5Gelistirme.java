package uygulama5Gelistirme;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Uygulama5Gelistirme {
	static Connection connection = null;
	 
	static PreparedStatement preparedStatement = null;
	
	public static void main(String[] args) {
		
		baglantiyiAc();
		
		ogrenciEkle(102, "Cengiz", "Kara", 1987, "123123");
	
		ogrenciEkle(103, "Betül", "Tatay", 1998, "23423432");
		
		baglantiyiKapat();
		
	}
	
	
	public static void ogrenciEkle(int ogrenciId, String adi, String soyadi, int dogumYili, String okulNumarasi){
		
		String sorgu = "INSERT INTO ogrenciler(ogrenciId, adi, soyadi, dogumYili, okulNumarasi) VALUES(?, ?, ?, ?, ?)";
		
		try {
			
			preparedStatement = (PreparedStatement) connection.prepareStatement(sorgu);
			
			preparedStatement.setInt(1, ogrenciId);
			preparedStatement.setString(2, adi);
			preparedStatement.setString(3, soyadi);
			preparedStatement.setInt(4, dogumYili);
			preparedStatement.setString(5, okulNumarasi);

			preparedStatement.executeUpdate();
			
			
		} catch (SQLException e) {

			System.err.println("Hata : "+ e);
		}
	}
	
	
	public static void baglantiyiAc(){
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
		
		} catch (ClassNotFoundException e) {
			
			System.err.println("Mysql Driver bulunamadý.");
			System.err.println("Hata : " + e);	
			return;
		}
		
		
		try {
			
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/javase_vt", "root",
					"w4tchDC!iDa");
		
		} catch (SQLException e) {
			
			System.err.println("Baglanti oluþurken bir hata oluþtu.");
			System.err.println("Hata : " + e);
			return;
		}
	}
	
	public static void baglantiyiKapat(){
		
		if(connection != null){
			
			try {
			
				connection.close();
			
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
		
		
	}

}
