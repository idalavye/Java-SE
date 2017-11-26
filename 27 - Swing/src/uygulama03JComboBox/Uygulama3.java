package uygulama03JComboBox;

import java.awt.EventQueue;import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

@SuppressWarnings("serial")
public class Uygulama3 extends JFrame {

	private JPanel panel;

	private JComboBox<String> comboBox;
	
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				
				try {
				
					Uygulama3 frame = new Uygulama3();
					frame.deneme();
					frame.secilen();
					frame.setVisible(true);
				
				} catch (Exception e) {
					
					System.err.println("HATA : " + e);
				}
			}
		});
		
	}

	
	
	public Uygulama3() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 450, 300);
		
		panel = new JPanel();
		
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(panel);
		panel.setLayout(null);
		
		comboBox = new JComboBox<>();
		
		String [] dizi = {"Ferhat", "Ahmet", "Baki", "Ömer"};
		
		ComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(dizi);
	
		comboBox.setModel(comboBoxModel);
		
		comboBox.setSelectedIndex(3);
		
		comboBox.setBounds(90, 84, 104, 20);
		panel.add(comboBox);
	}
	
	public void deneme(){
		
		comboBox.addItem("Hasan");
		
		String secilen = (String) comboBox.getSelectedItem();
		
		System.out.println(secilen);
	}
	
	public void secilen(){
		
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String secilen = (String) comboBox.getSelectedItem();
				System.out.println("Secilen : " + secilen);
				
			}
		});
		
	}

}
