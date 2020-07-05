package view.nhanvien;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import dao.GiuongDAO;
import model.Giuong;
import model.NhanVien;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class SearchBedFrm extends JFrame {

	private JPanel contentPane;
	private JTextField txtNgay;
	private JTextField txtGia;
	private JTable table;
	private ArrayList<Giuong> listGiuong;
	private NhanVien nhanVien;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchBedFrm frame = new SearchBedFrm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SearchBedFrm(NhanVien nv) {
		this.nhanVien = nv;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLabel = new JLabel("Tiem kiem giuong trong");
		lblLabel.setBounds(150, 11, 133, 14);
		contentPane.add(lblLabel);
		
		JLabel lblNewLabel = new JLabel("Ngay bat dau o");
		lblNewLabel.setBounds(10, 35, 74, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Gia mong muon");
		lblNewLabel_1.setBounds(10, 73, 96, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNgay = new JTextField();
		txtNgay.setToolTipText("2020/01/01");
		txtNgay.setBounds(146, 36, 86, 20);
		contentPane.add(txtNgay);
		txtNgay.setColumns(10);
		
		txtGia = new JTextField();
		txtGia.setBounds(146, 67, 86, 20);
		contentPane.add(txtGia);
		txtGia.setColumns(10);
		
		JButton btnSearch = new JButton("Tim kiem");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btnClicked = (JButton)e.getSource();
				if(btnClicked.equals(btnSearch)){
					String ngay  = txtNgay.getText();
					Float gia = Float.parseFloat(txtGia.getText());
					if((txtNgay.getText() == null)||(txtNgay.getText().length() == 0))
						return;
					if((txtGia.getText() == null)||(txtGia.getText().length() == 0))
						return;
					Date date =new SimpleDateFormat("dd/MM/yyyy").parse(ngay);  
					GiuongDAO rd = new GiuongDAO();
					listGiuong = rd.timKiemGiuongTrong(date, Float.parseFloat(txtGia.getText()));
					String[] columnNames = {"Id", "Giuong", "Phong", "Loai", "Gia", "Tien coc", "Mo ta"};
					String[][] value = new String[listGiuong.size()][5];
					for(int i=0; i<listGiuong.size(); i++){
						value[i][0] = listGiuong.get(i).getID() +"";
						value[i][1] = listGiuong.get(i).getTenGiuong();
						value[i][2] = listGiuong.get(i).getPho;
						value[i][2] = listGiuong.get(i).getKieuGiuong();
						value[i][3] = listGiuong.get(i).getGiaThue();
						value[i][4] = listGiuong.get(i).getDes();
					}
					DefaultTableModel tableModel = new DefaultTableModel(value, columnNames) {
					    @Override
					    public boolean isCellEditable(int row, int column) {
					       //unable to edit cells
					       return false;
					    }
					};
					tblResult.setModel(tableModel);
				}
			}
		});
		btnSearch.setBounds(150, 98, 89, 23);
		contentPane.add(btnSearch);
		
		table = new JTable();
		table.setBounds(10, 131, 414, 120);
		contentPane.add(table);
	}
}
