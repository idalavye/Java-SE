package uygulama2SorguGönderme;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Uygulama2SorguGonderme {
public static void main(String[] args) {
	
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
	
	} catch (ClassNotFoundException e) {
		
		System.err.println("Mysql Driver Bulunamadı");
		System.err.println("Hata" + e);
	
		return; //herhangi bir hata olursa main i sonlandır.
	}
	
	Connection connection = null;
	Statement statement = null; //sorgularımızı gönderebiliriz.
		
	try {
		
		connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/javase_vt","root","w4tchDC!iDa");
		statement = (Statement) connection.createStatement();
		
		String sorgu = "CREATE TABLE Ogrenci(ogrenciId INT PRIMARY KEY NOT NULL, adi VARCHAR(20), soyadi VARCHAR(20), dogumYili INT, okulNumarasi VARCHAR(20))";
		
		statement.execute(sorgu);
		
		System.out.println("Mysql e bağlandık :)");
	
	} catch (SQLException e) {
		System.err.println("Mysql e bağlanamadık");
		System.err.println("Hata" + e);
		return;
	}
	finally {
		
		if(statement != null){
			
			try {
			
				statement.close();
			
			} catch (SQLException e) {
				
				System.err.println("Statement kapatılırken bir hata ile karsılastık");
			}
		}
		if(connection != null){
			
			try {
				
				connection.close();
			
			} catch (SQLException e) {
				System.err.println("Connection kapatılırken bir hata ile karsılastık");
			}
			
		}
		
	}
	
	
	
}

}
