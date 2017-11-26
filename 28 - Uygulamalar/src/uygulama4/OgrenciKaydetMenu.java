package uygulama4;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class OgrenciKaydetMenu extends JFrame {

	private JPanel panel;

	public OgrenciKaydetMenu() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 500);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true);
		setContentPane(panel);
		panel.setLayout(null);
	}

}
