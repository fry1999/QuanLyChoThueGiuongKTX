package model;

public class Phong {
	private int ID;
	private String tenPhong;
	private String loaiPhong;
	private String moTa;
	private KyTucXa kyTucXa;
	public Phong() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getTenPhong() {
		return tenPhong;
	}
	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}
	public String getLoaiPhong() {
		return loaiPhong;
	}
	public void setLoaiPhong(String loaiPhong) {
		this.loaiPhong = loaiPhong;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public KyTucXa getKyTucXa() {
		return kyTucXa;
	}
	public void setKyTucXa(KyTucXa kyTucXa) {
		this.kyTucXa = kyTucXa;
	}
}
