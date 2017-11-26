package frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import islemler.OgrenciIslemleri;
import islemler.impl.OgrenciIslemleriImpl;
import tasarim.Ogrenci;

import javax.swing.JLabel;

import java.awt.Font;
import java.time.LocalDateTime;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class OgrenciKayitMenusu extends JFrame {
	
	private OgrenciIslemleri ogrenciIslemleri = new OgrenciIslemleriImpl();
	
	private JPanel contentPane;
	private JTextField txtAdi;
	private JLabel lblSoyad;
	private JTextField txtSoyadi;
	private JTextField txtOkulNumarasi;
	private JTextField txtTc;

	private JComboBox<String> comboBoxGunler;
	private JComboBox<String> comboBoxAylar;
	JComboBox<String> comboBoxYillar;
	
	public OgrenciKayitMenusu() {
		setTitle("Ogrenci Kayit islemleri");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAd = new JLabel("Ad\u0131 : ");
		lblAd.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAd.setBounds(67, 87, 61, 14);
		contentPane.add(lblAd);
		
		txtAdi = new JTextField();
		txtAdi.setBounds(153, 86, 155, 20);
		contentPane.add(txtAdi);
		txtAdi.setColumns(10);
		
		lblSoyad = new JLabel("Soyad\u0131 : ");
		lblSoyad.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSoyad.setBounds(67, 123, 94, 14);
		contentPane.add(lblSoyad);
		
		txtSoyadi = new JTextField();
		txtSoyadi.setBounds(153, 122, 155, 20);
		contentPane.add(txtSoyadi);
		txtSoyadi.setColumns(10);
		
		JLabel lblDogumTarihi = new JLabel("Dogum Tarihi");
		lblDogumTarihi.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDogumTarihi.setBounds(62, 163, 119, 14);
		contentPane.add(lblDogumTarihi);
		
		comboBoxGunler = new JComboBox<>();
		comboBoxGunler.setModel(new DefaultComboBoxModel<String>(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10"}));
		comboBoxGunler.setBounds(62, 190, 66, 20);
		contentPane.add(comboBoxGunler);
		
		comboBoxAylar = new JComboBox<>();
		comboBoxAylar.setModel(new DefaultComboBoxModel<String>(new String[] {"Ocak", "\u015Eubat", "Mart", "Nisan", "May\u0131s"}));
		comboBoxAylar.setBounds(153, 190, 71, 20);
		contentPane.add(comboBoxAylar);
		
		comboBoxYillar = new JComboBox<>();
		comboBoxYillar.setModel(new DefaultComboBoxModel<String>(new String[] {"1992", "1993", "1994", "1995"}));
		comboBoxYillar.setBounds(250, 190, 71, 20);
		contentPane.add(comboBoxYillar);
		
		JLabel lblOkulnumarasi = new JLabel("OkulNumarasi : ");
		lblOkulnumarasi.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblOkulnumarasi.setBounds(67, 240, 137, 25);
		contentPane.add(lblOkulnumarasi);
		
		txtOkulNumarasi = new JTextField();
		txtOkulNumarasi.setBounds(214, 244, 164, 20);
		contentPane.add(txtOkulNumarasi);
		txtOkulNumarasi.setColumns(10);
		
		JButton btnOgrenciyikaydet = new JButton("OgrenciyiKaydet");
		btnOgrenciyikaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ogrenciOlusturVeKaydet();
				
				txtAdi.setText("");
				txtSoyadi.setText("");
				txtOkulNumarasi.setText("");
				txtTc.setText("");
				comboBoxAylar.setSelectedIndex(0);
				comboBoxGunler.setSelectedItem(0);
				comboBoxYillar.setSelectedItem(0);
			}
		});
		btnOgrenciyikaydet.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnOgrenciyikaydet.setBounds(102, 320, 216, 62);
		contentPane.add(btnOgrenciyikaydet);
		
		JLabel lblTc = new JLabel("TC : ");
		lblTc.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTc.setBounds(62, 45, 61, 14);
		contentPane.add(lblTc);
		
		txtTc = new JTextField();
		txtTc.setBounds(153, 44, 155, 20);
		contentPane.add(txtTc);
		txtTc.setColumns(10);
		
	}
	
	public void ogrenciOlusturVeKaydet(){
		
		String tcS = txtTc.getText();
		
		int tc = Integer.valueOf(tcS);
		String adi = txtAdi.getText();
		String soyadi = txtSoyadi.getText();
		
		
		String okulNumarasi = txtOkulNumarasi.getText();
		
		
		LocalDateTime dogumTarihi  =tarihiAl(); 
		
		Ogrenci ogrenci = new Ogrenci(tc, adi, soyadi, dogumTarihi, okulNumarasi);
		
		ogrenciIslemleri.ogrenciKaydet(ogrenci);
		
	}
	
	public LocalDateTime tarihiAl(){
		
		
		String gun = (String) comboBoxGunler.getSelectedItem();
		
		int ay =  comboBoxAylar.getSelectedIndex();
		
		String yil = (String) comboBoxYillar.getSelectedItem();
		
		
		int year = Integer.valueOf(yil);
		int day = Integer.valueOf(gun);
		
		LocalDateTime localDateTime = LocalDateTime.of(year, ay+1, day, 0, 0);
		return localDateTime;
	}
	
	
	
	
}
