package uygulama2SorguG�nderme;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Uygulama2SorguGonderme {
public static void main(String[] args) {
	
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
	
	} catch (ClassNotFoundException e) {
		
		System.err.println("Mysql Driver Bulunamad�");
		System.err.println("Hata" + e);
	
		return; //herhangi bir hata olursa main i sonland�r.
	}
	
	Connection connection = null;
	Statement statement = null; //sorgular�m�z� g�nderebiliriz.
		
	try {
		
		connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/javase_vt","root","w4tchDC!iDa");
		statement = (Statement) connection.createStatement();
		
		String sorgu = "CREATE TABLE Ogrenci(ogrenciId INT PRIMARY KEY NOT NULL, adi VARCHAR(20), soyadi VARCHAR(20), dogumYili INT, okulNumarasi VARCHAR(20))";
		
		statement.execute(sorgu);
		
		System.out.println("Mysql e ba�land�k :)");
	
	} catch (SQLException e) {
		System.err.println("Mysql e ba�lanamad�k");
		System.err.println("Hata" + e);
		return;
	}
	finally {
		
		if(statement != null){
			
			try {
			
				statement.close();
			
			} catch (SQLException e) {
				
				System.err.println("Statement kapat�l�rken bir hata ile kars�last�k");
			}
		}
		if(connection != null){
			
			try {
				
				connection.close();
			
			} catch (SQLException e) {
				System.err.println("Connection kapat�l�rken bir hata ile kars�last�k");
			}
			
		}
		
	}
	
	
	
}

}
