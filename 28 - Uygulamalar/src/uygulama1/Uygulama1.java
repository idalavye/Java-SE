package uygulama1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Uygulama1 extends JFrame {

	private JPanel contentPane;

	private JTextField txtGiris1;
	
	private JTextField txtGiris2;
	private JButton btnTopla;
	private JLabel lblSonuc;
	private JTextField textField;

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
		
			public void run() {
				try {
					
					
					Uygulama1 frame = new Uygulama1();
				
					frame.setVisible(true);
				
				
				} catch (Exception e) {
					System.err.println("Hata : " +e);
				}
				
			}
		});
	}


	public Uygulama1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtGiris1 = new JTextField();
		txtGiris1.setBounds(124, 30, 86, 20);
		contentPane.add(txtGiris1);
		txtGiris1.setColumns(10);
		
		JLabel lblSayi = new JLabel("Sayi1 : ");
		lblSayi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSayi.setBounds(68, 31, 69, 19);
		contentPane.add(lblSayi);
		
		JLabel lblSayi_1 = new JLabel("Sayi2 : ");
		lblSayi_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSayi_1.setBounds(68, 75, 69, 19);
		contentPane.add(lblSayi_1);
		
		txtGiris2 = new JTextField();
		txtGiris2.setBounds(124, 76, 86, 20);
		contentPane.add(txtGiris2);
		txtGiris2.setColumns(10);
		
		btnTopla = new JButton("Topla");

	
		btnTopla.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnTopla.setBounds(121, 125, 89, 23);
		
		btnTopla.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				topla();
			}
		});
		contentPane.add(btnTopla);
		
		lblSonuc = new JLabel("Sonuc");
		lblSonuc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSonuc.setBounds(281, 58, 63, 23);
		contentPane.add(lblSonuc);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(338, 61, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
	}
	
	public void topla(){
		
		String giris1 = txtGiris1.getText();
		
		int sayi1 = Integer.valueOf(giris1);
		
		String giris2 = txtGiris2.getText();
		
		int sayi2 = Integer.valueOf(giris2);
		
		int toplam = sayi1 + sayi2;
		
		String toplamS = String.valueOf(toplam);
		
		textField.setText(toplamS);
		
	}
	
	
	
}
