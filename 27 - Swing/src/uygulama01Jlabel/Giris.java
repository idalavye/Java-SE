package uygulama01Jlabel;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Giris extends JFrame {

	private JPanel panel;

	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Giris frame = new Giris();
					
					//Pencereyi ekranda göster
					frame.setVisible(true);
				
				} catch (Exception e) {
				
					System.err.println("Hata : " + e);
				}
			}
		});

	}

	public Giris() {
		setTitle("Giris");
		
		//Uygulamada kapatma tusuna bastýgýmýzda ne yapýlacagýný belirtiyoruz.
		//JFrame.EXIT_ON_CLOSE = Tamamen uygulamayý kapat.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//uygulamamýzýn genisligini veya boyutunu ayarlamak icin kullanýrýz.
		setBounds(100, 100, 577, 422);
		
		panel = new JPanel();
		
		
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panel);
		panel.setLayout(null);
		
		JLabel lblAdi = new JLabel("Ad\u0131n\u0131z : ");
		lblAdi.setBounds(102, 120, 38, 14);
		lblAdi.setIcon(null);
		
		panel.add(lblAdi);
		
		JLabel lblSoyadinz = new JLabel("Soyadin\u0131z : ");
		lblSoyadinz.setBounds(102, 147, 65, 14);
		panel.add(lblSoyadinz);
		
		JLabel lblDeneme = new JLabel("Deneme");
		lblDeneme.setBounds(102, 185, 65, 14);
		panel.add(lblDeneme);
		
		JLabel ozel = new JLabel("Ozel : ");
		ozel.setBounds(102, 230, 50, 20);
		
		panel.add(ozel);
		
		
		
	}
}
