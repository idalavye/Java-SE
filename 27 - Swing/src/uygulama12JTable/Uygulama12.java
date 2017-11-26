package uygulama12JTable;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

@SuppressWarnings("serial")
public class Uygulama12 extends JFrame {

	private JPanel contentPane;
	private JTable table;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Uygulama12 frame = new Uygulama12();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Uygulama12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
				{1994, "Aykan", "Ferhat", "231312"},
				{213123, "Kaya", "Deniz", "1231231"},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"dogumYili", "Soyadi", "Adi", "okulNumarasi"
			}
		) {
			Class<?>[] columnTypes = new Class[] {Integer.class, String.class, String.class, String.class};
			public Class<?> getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setBounds(25, 227, 380, 113);
		contentPane.add(table);

		ListSelectionModel listSelectionModel = table.getSelectionModel();
		
		listSelectionModel.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				
			}
		});
		
		TableModel tableModel = table.getModel();
		
		tableModel.addTableModelListener(new TableModelListener() {
			
			@Override
			public void tableChanged(TableModelEvent e) {
				
				
				int firstRow = e.getFirstRow();
				System.out.println("Satir : " + firstRow);
				int sutun = e.getColumn();
				System.out.println("Sutun : " + sutun);
				
				Class<?> deneme =  tableModel.getColumnClass(sutun);
				
				if(deneme.getSimpleName().equals("String")){
					String sonuc = (String) tableModel.getValueAt(firstRow, sutun);
					System.out.println(sonuc);
				}
				else if(deneme.getSimpleName().equals("Integer")){
					Integer sonuc = (Integer) tableModel.getValueAt(firstRow, sutun);
					System.out.println(sonuc);
				}
				
			}
		});	
	}
}
