package uygulama1baglanti;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Uygulama1Baglanti {
	
	public static void main(String[] args) {
	
		try {
		
			Class.forName("com.mysql.jdbc.Driver");
		
		} catch (ClassNotFoundException e) {
			
			System.err.println("Mysql Driver Bulunamadý");
			System.err.println("Hata" + e);
		
			return; //herhangi bir hata olursa main i sonlandýr.
		}
		
		Connection connection = null;
		
		try {
			
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/javase_vt","root","w4tchDC!iDa");
			System.out.println("Mysql e baðlandýk :)");
		
		} catch (SQLException e) {
			System.err.println("Mysql e baðlanamadýk");
			System.err.println("Hata" + e);
			return;
		
		} finally{
			
			if(connection != null){
				try {
					connection.close();
				} catch (SQLException e) {
					System.out.println("Baðlantý kapatýlýrken hata oluþtu");
					System.out.println("Hata" + e);
				
				}
			}
		}
		
		
	}

}
