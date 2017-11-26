package uygulama08JTextArea;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;


@SuppressWarnings("serial")
public class uygulama8 extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					uygulama8 frame = new uygulama8();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public uygulama8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrDeneme = new JTextArea();
		txtrDeneme.setToolTipText("");
		txtrDeneme.setText("deneme");
		txtrDeneme.setBounds(74, 49, 219, 107);
		
		contentPane.add(txtrDeneme);
	}
}
