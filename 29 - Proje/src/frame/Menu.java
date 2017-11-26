package frame;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import islemler.OgrenciIslemleri;
import islemler.impl.OgrenciIslemleriImpl;
import tasarim.Ogrenci;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Menu extends JFrame {

	private JPanel contentPane;
	
	private OgrenciIslemleri ogrenciIslemleri = new OgrenciIslemleriImpl();
	
	private List<Ogrenci> ogrenciler;
	private JTextField txtBilgiYazdir;
	private JButton btnNewButton_1;
	
	private JList<Ogrenci> list;
	private JButton btnNewButton_2;

	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Menu() {
		setFont(new Font("Dialog", Font.BOLD, 15));
		setTitle("Otomasyon");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 937, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Ogrenci Kaydet");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				OgrenciKayitMenusu ogrenciKayitMenusu = new OgrenciKayitMenusu();
				
				ogrenciKayitMenusu.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(69, 42, 213, 53);
		contentPane.add(btnNewButton);
		
		ogrenciler = ogrenciIslemleri.ogrencileriAl();
		
		list = new JList<>();
		list.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		list.setModel(new AbstractListModel<Ogrenci>() {
			
			public int getSize() {
				return ogrenciler.size();
			}
			public Ogrenci getElementAt(int index) {
				return ogrenciler.get(index);
			}
		});
		
		list.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				if(e.getValueIsAdjusting()){
					
					Ogrenci ogrenci = list.getSelectedValue();
					
					txtBilgiYazdir.setText("Adi : " + ogrenci.getAdi() + ", Soyadi : " + ogrenci.getSoyadi() +", Dogum Tarihi : " + ogrenci.getDogumTarihi() +
													", Okul Numarasi : " + ogrenci.getOkulNumarasi());
				}
			}
		});
		
		list.setBounds(590, 42, 194, 283);
		contentPane.add(list);
		
		txtBilgiYazdir = new JTextField();
		txtBilgiYazdir.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtBilgiYazdir.setEditable(false);
		txtBilgiYazdir.setBounds(43, 349, 755, 72);
		contentPane.add(txtBilgiYazdir);
		txtBilgiYazdir.setColumns(10);
		
		btnNewButton_1 = new JButton("Sil");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Ogrenci ogrenci = list.getSelectedValue();
				
				ogrenciIslemleri.ogrenciSil(ogrenci.getId());
				
				ogrenciler.remove(ogrenci);
				
				list.setModel(new AbstractListModel<Ogrenci>() {

					@Override
					public int getSize() {
						// TODO Auto-generated method stub
						return ogrenciler.size();
					}

					@Override
					public Ogrenci getElementAt(int index) {
						// TODO Auto-generated method stub
						return ogrenciler.get(index);
					}
				});
				txtBilgiYazdir.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(427, 72, 141, 77);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("yenile");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				List<Ogrenci> ogrenciler = ogrenciIslemleri.ogrencileriAl();
				
				list.setModel(new AbstractListModel<Ogrenci>() {

					@Override
					public int getSize() {
						// TODO Auto-generated method stub
						return ogrenciler.size();
					}

					@Override
					public Ogrenci getElementAt(int index) {
						// TODO Auto-generated method stub
						return ogrenciler.get(index);
					}
				});
			}
		});
		btnNewButton_2.setBounds(427, 184, 110, 23);
		contentPane.add(btnNewButton_2);
	}
	

}
