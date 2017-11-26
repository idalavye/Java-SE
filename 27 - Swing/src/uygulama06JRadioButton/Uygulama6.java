package uygulama06JRadioButton;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;


@SuppressWarnings("serial")
public class Uygulama6 extends JFrame {

	private JPanel panel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Uygulama6 frame = new Uygulama6();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Uygulama6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 400);
		
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnDeneme = new JRadioButton("deneme");
		

		rdbtnDeneme.setBounds(76, 114, 109, 23);
		panel.add(rdbtnDeneme);

		JRadioButton rdbtnCalisma = new JRadioButton("calisma");
		rdbtnCalisma.setBounds(206, 114, 109, 23);
		panel.add(rdbtnCalisma);
		
		
	}
}
