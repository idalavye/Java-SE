package uygulama02JTextField;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Uygulama2 extends JFrame {

	private JPanel panel;
	private JTextField adGiris;


	public static void main(String[] args) {
	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Uygulama2 frame = new Uygulama2();
					
					
					frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
	}


	public Uygulama2() {
		
		//alt + shift + r
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(25, 72, 46, 14);
		panel.add(lblNewLabel);
		
		adGiris = new JTextField();
		adGiris.setText("adinizi Giriniz");
		adGiris.setHorizontalAlignment(SwingConstants.LEFT);
		adGiris.setBounds(81, 69, 200, 17);
		
		panel.add(adGiris);
		adGiris.setColumns(10);
	}

}
