package uygulama6Delete;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Uygulama6Delete {
	
	static Connection connection = null;
	 
	static PreparedStatement preparedStatement = null;
	
	public static void main(String[] args) {
		
		baglantiyiAc();
		
		ogrenciSil(101);
		
		ogrenciSil(103);
		
		baglantiyiKapat();
		
	}
	
	public static void ogrenciSil(int ogrenciId){
		
		String sorgu = "DELETE FROM ogrenciler WHERE ogrenciId = ?";
		
		try {
		
			preparedStatement = (PreparedStatement) connection.prepareStatement(sorgu);
		
			preparedStatement.setInt(1, ogrenciId);
			
			preparedStatement.executeUpdate();
			
			System.out.println( ogrenciId + " id'li ogrenci silindi.");
			
			
		} catch (SQLException e) {

			System.err.println("Hata : " + e);
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
