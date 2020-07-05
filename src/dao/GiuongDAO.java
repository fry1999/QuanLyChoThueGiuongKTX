package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Giuong;
import model.GiuongDuocThue;

public class GiuongDAO extends DAO {

	public GiuongDAO() {
		super();
	}
	
	public static ArrayList<GiuongDuocThue> timKiemGiuongChuaLenHoaDon(){
		//Trả về tblGiuong chưa lên hóa đơn.
		ArrayList<GiuongDuocThue> listG = new ArrayList<GiuongDuocThue>();
		String sqlSearch = "(SELECT tblgiuong.*, GDT.* FROM tblgiuong "
				+ "INNER JOIN (SELECT * FROM tblgiuongduocthue WHERE ID NOT IN (SELECT tblhoadon.IDgiuongduocthue FROM tblhoadon)) AS GDT "
				+ "ON (tblgiuong.ID = GDT.IDgiuong))";
		try {
			
			PreparedStatement ps = con.prepareStatement(sqlSearch);
			ResultSet rs = ps.executeQuery();
			System.out.println("1");
			while(rs.next()) {
				Giuong giuong = new Giuong();
				giuong.setID(rs.getInt("tblgiuong.ID"));
				giuong.setTenGiuong(rs.getString("tblgiuong.tengiuong"));
				giuong.setKieuGiuong(rs.getString("tblgiuong.kieugiuong"));
				giuong.setGiaThue(rs.getFloat("tblgiuong.giathue"));
				giuong.setMoTa(rs.getString("tblgiuong.mota"));
				
				
				GiuongDuocThue giuongDuocThue = new GiuongDuocThue();
				giuongDuocThue.setGiuong(giuong);
				giuongDuocThue.setID(rs.getInt("GDT.ID"));
				giuongDuocThue.setNgayBatDau(rs.getDate("GDT.ngaybatdau"));
				giuongDuocThue.setNgayKetThuc(rs.getDate("GDT.ngaybatdau"));
				giuongDuocThue.setGia(rs.getFloat("GDT.giathue"));
				giuongDuocThue.setGhiChu(rs.getString("GDT.ghichu"));
				listG.add(giuongDuocThue);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listG;
		
	}
	
}
