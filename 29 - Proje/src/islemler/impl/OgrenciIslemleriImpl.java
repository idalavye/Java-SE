package islemler.impl;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

import islemler.OgrenciIslemleri;
import tasarim.Ogrenci;
import veritabaniBaglanti.VeritabaniBaglanti;

public class OgrenciIslemleriImpl implements OgrenciIslemleri{
	
	private VeritabaniBaglanti baglanti = new VeritabaniBaglanti();
	
	@Override
	public boolean ogrenciKaydet(Ogrenci ogrenci) {

		String sorgu = "INSERT INTO ogrenci(id, adi, soyadi, dogumTarihi, okulNumarasi) VALUES(?, ?, ?, ?, ?)";
		
		Connection connection = baglanti.baglantiyiAl();
		
		try {
		
			PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sorgu);
			
			preparedStatement.setInt(1, ogrenci.getId());
			preparedStatement.setString(2, ogrenci.getAdi());
			preparedStatement.setString(3, ogrenci.getSoyadi());
			preparedStatement.setTimestamp(4, Timestamp.valueOf(ogrenci.getDogumTarihi()));
			preparedStatement.setString(5, ogrenci.getOkulNumarasi());
			
			preparedStatement.executeUpdate();
			
			baglanti.baglantilariKapat(connection, preparedStatement, null);
			
		} catch (SQLException e) {
			
			System.err.println("Hata : " + e);
			return false;
		}
		
		return true;
	}

	@Override
	public boolean ogrenciSil(int id) {
		
		String sorgu = "DELETE FROM ogrenci WHERE id = ?";
		
		Connection connection = baglanti.baglantiyiAl();
		
		try {
		
			PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sorgu);
			preparedStatement.setInt(1, id);
			
			preparedStatement.executeUpdate();
			
			baglanti.baglantilariKapat(connection, preparedStatement, null);
			
		} catch (SQLException e) {
			System.err.println("Hata : " + e);
			return false;
		}
		
		return true;
	}

	@Override
	public Ogrenci ogrenciGuncelle(Ogrenci ogrenci) {

		String sorgu = "UPDATE ogrenci SET adi = ?, soyadi = ?, dogumTarihi = ?, okulNumarasi = ? WHERE id = ?";
		
		Connection connection = baglanti.baglantiyiAl();
		
		try {
			
			PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sorgu);
			
			preparedStatement.setString(1, ogrenci.getAdi());
			preparedStatement.setString(2, ogrenci.getSoyadi());
			preparedStatement.setTimestamp(4, Timestamp.valueOf(ogrenci.getDogumTarihi()));
			preparedStatement.setString(4, ogrenci.getOkulNumarasi());
			preparedStatement.setInt(5, ogrenci.getId());
			
			preparedStatement.executeUpdate();
			
			baglanti.baglantilariKapat(connection, preparedStatement, null);
			
		} catch (SQLException e) {
			
			System.err.println("Hata : " + e);
			return null;
		}
		return ogrenci;
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Ogrenci> ogrencileriAl() {

		String sorgu = "SELECT * FROM ogrenci";
		
		List<Ogrenci> ogrenciler = new ArrayList<>();
		
		Connection connection = baglanti.baglantiyiAl();
		
		try {
			
			PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sorgu);
			
			ResultSet resultSet = (ResultSet) preparedStatement.executeQuery();
			
			while(resultSet.next()){
				
				Ogrenci ogrenci = new Ogrenci();
				
				int id = resultSet.getInt("id");
				
				ogrenci.setId(id);
				ogrenci.setAdi(resultSet.getString("adi"));
				ogrenci.setSoyadi(resultSet.getString("soyadi"));
				Date date = resultSet.getDate("dogumTarihi");
				LocalDateTime dogumTarihi = LocalDateTime.of(date.getYear(), date.getMonth(), date.getDate(), 0, 0);
				ogrenci.setDogumTarihi(dogumTarihi);
				ogrenci.setOkulNumarasi(resultSet.getString("okulNumarasi"));
				ogrenciler.add(ogrenci);
			}
			
			baglanti.baglantilariKapat(connection, preparedStatement, resultSet);
			
		} catch (SQLException e) {
			
			System.err.println("Hata : " + e);
			return null;
		}
		return ogrenciler;
	}

	@SuppressWarnings("deprecation")
	@Override
	public Ogrenci ogrenciBul(int id) {
		
		String sorgu = "SELECT * FROM ogrenci WHERE id = ?";
		
		Connection connection = baglanti.baglantiyiAl();
		
		Ogrenci ogrenci = null;
		
		try {
			
			PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sorgu);
			preparedStatement.setInt(1, 1);
			
			ResultSet resultSet = (ResultSet) preparedStatement.executeQuery();
			
			resultSet.next();
			int idd = resultSet.getInt("id");
			String adi = resultSet.getString("adi");
			String soyadi = resultSet.getString("soyadi");
			
			Date date = resultSet.getDate("dogumTarihi");
			LocalDateTime dogumTarihi = LocalDateTime.of(date.getYear(), date.getMonth(), date.getDate(), 0, 0);
			String okulNumarasi = resultSet.getString("okulNumarasi");
			
			ogrenci = new Ogrenci(idd, adi, soyadi, dogumTarihi, okulNumarasi);
			
			baglanti.baglantilariKapat(connection, preparedStatement, resultSet);
		} catch (SQLException e) {
			
			System.err.println("Hata : " + e);
			return null;
		}
		
		
		return ogrenci;
	}

}
