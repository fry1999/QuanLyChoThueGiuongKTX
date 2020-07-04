package view.nhanvien;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import dao.GiuongDAO;
import model.Giuong;
import model.GiuongDuocThue;
import model.NhanVien;
import view.giuong.ManageBedFrm;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class ManageHomeFrm extends JFrame implements ActionListener{
	ArrayList<GiuongDuocThue> listG ;
	private JPanel contentPane;
	private JButton btnLenHoaDon;
	private NhanVien nhanVien;


	public ManageHomeFrm(NhanVien nhanVien) {
		super();
		this.nhanVien = nhanVien;
		this.listG = new ArrayList<GiuongDuocThue>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Quản lý KTX");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(130, 10, 162, 32);
		contentPane.add(lblNewLabel);
		
		btnLenHoaDon = new JButton("Lên hóa đơn hàng tháng cho khách hàng");
		btnLenHoaDon.addActionListener(this);
		btnLenHoaDon.setFont(new Font("Arial", Font.PLAIN, 14));
		btnLenHoaDon.setBounds(54, 112, 306, 25);
		contentPane.add(btnLenHoaDon);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if((e.getSource() instanceof JButton) && (e.getSource().equals(btnLenHoaDon))){
			
			GiuongDAO gd = new GiuongDAO();
			listG = gd.timKiemGiuongChuaLenHoaDon();
			(new ManageBedFrm(nhanVien, listG)).setVisible(true);
			this.dispose();
			
			
		}
		
	}
}
