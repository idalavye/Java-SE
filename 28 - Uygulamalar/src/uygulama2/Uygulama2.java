package uygulama2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.AbstractListModel;

@SuppressWarnings("serial")
public class Uygulama2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JList<String> list;
	private JButton btnEkle;
	
	private List<String> elemanList = new ArrayList<>();
	private JTextField textField_1;
	private JButton btnSil;
	
	
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Eklenecek isim : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(31, 83, 117, 28);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(162, 89, 127, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		list = new JList<String>();
		list.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		list.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				String sonuc = list.getSelectedValue();
				goster(sonuc);
			}
		});
		list.setBounds(344, 25, 102, 237);
		contentPane.add(list);
		
		btnEkle = new JButton("Ekle");
		
		btnEkle.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ekle();
				
			}
		});
	
		btnEkle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEkle.setBounds(177, 149, 89, 28);
		contentPane.add(btnEkle);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setEditable(false);
		textField_1.setBounds(100, 255, 166, 80);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		btnSil = new JButton("Sil");
		btnSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String deger = list.getSelectedValue();
				elemanList.remove(deger);
				
				list.setModel(new AbstractListModel<String>() {

					@Override
					public int getSize() {
						// TODO Auto-generated method stub
						return elemanList.size();
					}

					@Override
					public String getElementAt(int index) {
						// TODO Auto-generated method stub
						return elemanList.get(index);
					}
				});
				
			}
		});
		btnSil.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSil.setBounds(344, 286, 89, 23);
		contentPane.add(btnSil);
	}
	
	public void ekle(){
		
		String eleman = textField.getText();
		elemanList.add(eleman);
		
		list.setModel(new AbstractListModel<String>() {

			@Override
			public int getSize() {
			
				return elemanList.size();
			}

			@Override
			public String getElementAt(int index) {

				return elemanList.get(index);
			}
			
		});
		
		textField.setText("");
		
	}
	
	public void goster(String eleman){
		
		textField_1.setText(eleman);
		
	}
	
}
