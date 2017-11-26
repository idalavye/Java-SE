package uygulama9Proje;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class VeritabaniIslemleriImpl implements VeritabaniIslemleri{

	private BaglantiIslemleri baglanti = new BaglantiIslemleri();
	
	@Override
	public void ogrenciKaydet(Ogrenci ogrenci) {
		
		String sorgu = "INSERT INTO ogrenciler(ogrenciId,adi,soyadi,dogumYili,okulNumarasi) VALUES(?,?,?,?,?)";
		
		PreparedStatement preparedStatement = null;
		
		Connection connection = baglanti.baglantiAl();
		
		try {
			preparedStatement = (PreparedStatement) connection.prepareStatement(sorgu);
			preparedStatement.setInt(1, ogrenci.getOgrenciId());
			preparedStatement.setString(2, ogrenci.getAdi());
			preparedStatement.setString(3, ogrenci.getSoyadi());
			preparedStatement.setInt(4, ogrenci.getDogumYili());
			preparedStatement.setString(5, ogrenci.getOkulNumarasi());
			
			preparedStatement.executeUpdate();
			
			baglanti.baglantilarikapat(connection, preparedStatement, null);
			
		} catch (SQLException e) {
			System.err.println("Hata" + e);
		}
		
	}

	@Override
	public void ogrensiSil(int ogrenciId) {
		
		String sorgu = "DELETE FROM ogrenciler WHERE ogrenciId = ?";
		
		Connection connection = baglanti.baglantiAl();
		
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = (PreparedStatement) connection.prepareStatement(sorgu);
			preparedStatement.setInt(1, ogrenciId);
			preparedStatement.executeUpdate();
			
			baglanti.baglantilarikapat(connection, preparedStatement, null);
			
		} catch (SQLException e) {
			System.err.println("Hata" + e);
		}
		
	}

	@Override
	public void ogrenciGuncelle(Ogrenci ogrenci) {
		
		String sorgu = "UPDATE ogrenciler SET adi = ?, soyadi =?,dogumYili=?, okulNumarasi =? WHERE ogrenciId =?";
		
		Connection connection = baglanti.baglantiAl();
		
		try {
			PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sorgu);
			preparedStatement.setString(1, ogrenci.getAdi());
			preparedStatement.setString(2, ogrenci.getSoyadi());
			preparedStatement.setInt(3, ogrenci.getDogumYili());
			preparedStatement.setString(4, ogrenci.getOkulNumarasi());
			preparedStatement.setInt(5, ogrenci.getOgrenciId());
			
			preparedStatement.executeUpdate();
			
			baglanti.baglantilarikapat(connection, preparedStatement, null);
		
		
		} catch (SQLException e) {
			System.err.println("Hata" + e);
		}
	}

	@Override
	public void ogrenciListele() {
		
		String sorgu = "SELECT * FROM ogrenciler";
		
		Connection connection = baglanti.baglantiAl();
		
		PreparedStatement preparedStatement = null;
		
		ArrayList<Ogrenci> ogrenciler = new ArrayList<>();
		try {
			preparedStatement = (PreparedStatement) connection.prepareStatement(sorgu);
			
			ResultSet resultSet = (ResultSet) preparedStatement.executeQuery();
			
			while(resultSet.next()){
				int id = resultSet.getInt("ogrenciId");
				String adi = resultSet.getString("adi");
				String soyadi = resultSet.getString("soyadi");
				int dogumYili = resultSet.getInt("dogumYili");
				String okulNumarasi = resultSet.getString("okulNumarasi");
				
				Ogrenci ogrenci = new Ogrenci(id, adi, soyadi, dogumYili, okulNumarasi);
				ogrenciler.add(ogrenci);
			}
			
			for (Ogrenci ogrenci : ogrenciler) {
				System.out.println(ogrenci);
			}
			
			
			baglanti.baglantilarikapat(connection, preparedStatement, resultSet);
		
		} catch (SQLException e) {
			System.err.println("Hata" + e);
		}
				
	}
		
	
	@Override
	public void ogrenciBul(int ogrenciId) {
		
		String sorgu = "SELECT * FROM ogrenciler WHERE ogrenciId =?";
		
		Connection connection = baglanti.baglantiAl();
		
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = (PreparedStatement) connection.prepareStatement(sorgu);
			
			preparedStatement.setInt(1, ogrenciId);
			
			ResultSet resultSet = (ResultSet) preparedStatement.executeQuery();
			
			resultSet.next();
			int id = resultSet.getInt("ogrenciId");
			String adi = resultSet.getString("adi");
			String soyadi = resultSet.getString("soyadi");
			int dogumYili = resultSet.getInt("dogumYili");
			String okulNumarasi = resultSet.getString("okulNumarasi");
			
			Ogrenci ogrenci = new Ogrenci(id, adi, soyadi, dogumYili, okulNumarasi);
			System.out.println(ogrenci);
			
			baglanti.baglantilarikapat(connection, preparedStatement, resultSet);
		
		} catch (SQLException e) {
			System.err.println("Hata" + e);
		}
		
		
	}

}
