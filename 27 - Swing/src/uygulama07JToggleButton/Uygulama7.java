package uygulama07JToggleButton;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;

@SuppressWarnings("serial")
public class Uygulama7 extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Uygulama7 frame = new Uygulama7();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Uygulama7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.setBounds(120, 106, 121, 23);
		tglbtnNewToggleButton.setToolTipText("sadqeqwe");
		
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				boolean durum = tglbtnNewToggleButton.isSelected();
				
				if(durum){
					
					System.out.println("Buton kapandý.");
				}
				
			}
		});
		
		contentPane.add(tglbtnNewToggleButton);
	}
}
