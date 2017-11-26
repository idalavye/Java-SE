package uygulama05CheckBox;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;

@SuppressWarnings("serial")
public class Uygulama5 extends JFrame {

	private JPanel panel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Uygulama5 frame = new Uygulama5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Uygulama5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		
		JCheckBox checkBoxKadin = new JCheckBox("Kadin");
		
		checkBoxKadin.setBounds(46, 112, 97, 31);
		panel.add(checkBoxKadin);
		
		JCheckBox chckbxErkek = new JCheckBox("Erkek");
		chckbxErkek.setBounds(46, 69, 97, 23);
		panel.add(chckbxErkek);

		
	
	}
}
