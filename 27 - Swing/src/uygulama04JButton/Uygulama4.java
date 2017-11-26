package uygulama04JButton;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class Uygulama4 extends JFrame {

	private JPanel panel;
	private JTextField textField;
	private JTextField textField_1;
	


	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				
				try {
					Uygulama4 frame = new Uygulama4();
					
					frame.setVisible(true);
					
				} catch (Exception e) {
					
					System.err.println("Hata : " + e);
				}
				
			}
			
		});
	}


	public Uygulama4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 373);
		
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("T\u0131kla");
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				System.out.println("Mouse buton üzerine geldi.");
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
	
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		btnNewButton.setBounds(186, 221, 174, 23);
		panel.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(189, 52, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(189, 125, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
	}
}
