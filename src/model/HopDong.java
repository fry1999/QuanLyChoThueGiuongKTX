package model;

import java.util.Date;

public class HopDong {
	private int ID;
	private Date ngayThue;
	private float giaThueKhoiDiem;
	private float tienCoc;
	private SinhVien sinhVien;
	private NhanVien nhanVien;
	private DienSuDung dienSuDung;
	private NuocSuDung nuocSuDung;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Date getNgayThue() {
		return ngayThue;
	}
	public void setNgayThue(Date ngayThue) {
		this.ngayThue = ngayThue;
	}
	public float getGiaThueKhoiDiem() {
		return giaThueKhoiDiem;
	}
	public void setGiaThueKhoiDiem(float giaThueKhoiDiem) {
		this.giaThueKhoiDiem = giaThueKhoiDiem;
	}
	public float getTienCoc() {
		return tienCoc;
	}
	public void setTienCoc(float tienCoc) {
		this.tienCoc = tienCoc;
	}
	public SinhVien getSinhVien() {
		return sinhVien;
	}
	public void setSinhVien(SinhVien sinhVien) {
		this.sinhVien = sinhVien;
	}
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	public DienSuDung getDienSuDung() {
		return dienSuDung;
	}
	public void setDienSuDung(DienSuDung dienSuDung) {
		this.dienSuDung = dienSuDung;
	}
	public NuocSuDung getNuocSuDung() {
		return nuocSuDung;
	}
	public void setNuocSuDung(NuocSuDung nuocSuDung) {
		this.nuocSuDung = nuocSuDung;
	}
	public HopDong() {
		super();
		// TODO Auto-generated constructor stub
	}
}
