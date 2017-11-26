package uygulama8Select;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class Uygulama8 {
	

	static Connection connection = null;
	 
	static PreparedStatement preparedStatement = null;
	
	static ResultSet resultSet = null;
	
	
	public static void main(String[] args) {
		
		baglantiyiAc();
		
		yazdir();
		
		baglantiyiKapat();
		
	}
	
	public static void yazdir(){
		
		
		String sorgu = "SELECT * FROM ogrenci";
		
		try {
		
			preparedStatement = (PreparedStatement) connection.prepareStatement(sorgu);
		
			resultSet = (ResultSet) preparedStatement.executeQuery();
			
			while(resultSet.next()){
				
				int ogrenciId = resultSet.getInt("ogrenciId");
				String ad = resultSet.getString("adi");
				String soyad = resultSet.getString("soyadi");
				int dogumYili = resultSet.getInt("dogumYili");
				String okulNumarasi = resultSet.getString("okulNumarasi");
				
				System.out.println(ogrenciId + " " + ad + " " + soyad + " " + dogumYili + " " + okulNumarasi);
			}
			
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
			
		if(resultSet != null){
			
			try {
				
				resultSet.close();
			
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
