package uygulama3PraparedStatemant;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Uygulama3PraparedStatement {
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
		
		} catch (ClassNotFoundException e) {
			
			System.err.println("Mysql Driver Bulunamadý");
			System.err.println("Hata" + e);
		
			return; //herhangi bir hata olursa main i sonlandýr.
		}
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/javase_vt","root","w4tchDC!iDa");
			
			String sorgu = "CREATE TABLE Ogrenci(ogrenciId INT PRIMARY KEY NOT NULL, adi VARCHAR(20), soyadi VARCHAR(20), dogumYili INT, okulNumarasi VARCHAR(20))";
			
			preparedStatement = (PreparedStatement) connection.prepareStatement(sorgu);
			preparedStatement.execute(); //tablo oluþtururken ve silerken execute kullanýrýz...
			
			System.out.println("Mysql e baðlandýk :)");
		
		} catch (SQLException e) {
			System.err.println("Mysql e baðlanamadýk");
			System.err.println("Hata" + e);
			return;
		}
		finally {
			if(preparedStatement != null){
				
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
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
