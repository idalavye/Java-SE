package uygulama3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class OgrenciKaydetMenu extends JFrame {

	private JPanel contentPane;
	private JTextField txtAdi;
	private JTextField txtSoyadi;
	private JTextField txtDogumYili;
	private JTextField txtNumara;
	
	private OgrenciIslemleri ogrenciIslemleri = new OgrenciIslemleriImpl();
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OgrenciKaydetMenu frame = new OgrenciKaydetMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public OgrenciKaydetMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 861, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdi = new JLabel("Adi : ");
		lblAdi.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAdi.setBounds(194, 64, 88, 39);
		contentPane.add(lblAdi);
		
		txtAdi = new JTextField();
		txtAdi.setBounds(299, 75, 86, 20);
		contentPane.add(txtAdi);
		txtAdi.setColumns(10);
		
		JLabel lblSoyadi = new JLabel("Soyadi : ");
		lblSoyadi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSoyadi.setBounds(194, 140, 73, 32);
		contentPane.add(lblSoyadi);
		
		txtSoyadi = new JTextField();
		txtSoyadi.setBounds(299, 148, 86, 20);
		contentPane.add(txtSoyadi);
		txtSoyadi.setColumns(10);
		
		JLabel lblDogumYili = new JLabel("DogumYili : ");
		lblDogumYili.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDogumYili.setBounds(194, 204, 88, 32);
		contentPane.add(lblDogumYili);
		
		txtDogumYili = new JTextField();
		txtDogumYili.setBounds(299, 212, 86, 20);
		contentPane.add(txtDogumYili);
		txtDogumYili.setColumns(10);
		
		JLabel lblOkulnumarasi = new JLabel("Numarasi : ");
		lblOkulnumarasi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOkulnumarasi.setBounds(194, 271, 88, 32);
		contentPane.add(lblOkulnumarasi);
		
		txtNumara = new JTextField();
		txtNumara.setBounds(299, 279, 86, 20);
		contentPane.add(txtNumara);
		txtNumara.setColumns(10);
		
		JButton btnKaydet = new JButton("Kaydet");
		btnKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ogrenciOlustur();
				
			}
		});
		btnKaydet.setBounds(234, 338, 89, 23);
		contentPane.add(btnKaydet);
	
	}
	
	
	
	public void ogrenciOlustur(){
		
		String adi = txtAdi.getText();
		String soyadi = txtSoyadi.getText();
		String dogumYiliS = txtDogumYili.getText();
		int dogumYili = Integer.valueOf(dogumYiliS);
		String okulNumarasi = txtNumara.getText();
		
		Ogrenci ogrenci = new Ogrenci(adi, soyadi, dogumYili, okulNumarasi);
		
		ogrenciIslemleri.ogrenciKaydet(ogrenci);
		System.out.println(ogrenci);
	}
}
