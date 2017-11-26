package uygulama7Update;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Uygulama7 {
	

	static Connection connection = null;
	 
	static PreparedStatement preparedStatement = null;
	
	public static void main(String[] args) {
		
		baglantiyiAc();
		
		guncelle("Ömer", "12312312", 103);
		
		baglantiyiKapat();
		
	}
	
	public static void guncelle(String adi, String okulNumarasi, int ogrenciId){
		
		
		String sorgu = "UPDATE ogrenci SET adi = ?, okulNumarasi = ? WHERE ogrenciId = ?";
		
		try {
			
			preparedStatement = (PreparedStatement) connection.prepareStatement(sorgu);
			
			preparedStatement.setString(1, adi);
			preparedStatement.setString(2, okulNumarasi);
			preparedStatement.setInt(3, ogrenciId);
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			System.err.println("Hata: " + e);
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
			
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/calisma", "root", "12345");
			
			System.out.println("Baglanti Acildi");
			
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
			
				System.out.println("Baglanti kapatýldý");
				
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
