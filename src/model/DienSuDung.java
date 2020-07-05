package model;

import java.util.Date;

public class DienSuDung {
	private int ID;
	private Date ngay;
	private float donGia;
	private int dongHo;
	private int daThanhToan;
	private Phong phong;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Date getNgay() {
		return ngay;
	}
	public void setNgay(Date ngay) {
		this.ngay = ngay;
	}
	public float getDonGia() {
		return donGia;
	}
	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}
	public int getDongHo() {
		return dongHo;
	}
	public void setDongHo(int dongHo) {
		this.dongHo = dongHo;
	}
	public int getDaThanhToan() {
		return daThanhToan;
	}
	public void setDaThanhToan(int daThanhToan) {
		this.daThanhToan = daThanhToan;
	}
	public Phong getPhong() {
		return phong;
	}
	public void setPhong(Phong phong) {
		this.phong = phong;
	}
	public DienSuDung() {
		super();
		// TODO Auto-generated constructor stub
	}
}
