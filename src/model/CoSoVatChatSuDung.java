package model;

import java.util.Date;

public class CoSoVatChatSuDung {
	private int ID;
	private int soLuong;
	private float gia;
	private Date ngayBatDau;
	private Phong phong;
	private CoSoVatChat coSoVatChat;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public float getGia() {
		return gia;
	}
	public void setGia(float gia) {
		this.gia = gia;
	}
	public Date getNgayBatDau() {
		return ngayBatDau;
	}
	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}
	public Phong getPhong() {
		return phong;
	}
	public void setPhong(Phong phong) {
		this.phong = phong;
	}
	public CoSoVatChat getCoSoVatChat() {
		return coSoVatChat;
	}
	public void setCoSoVatChat(CoSoVatChat coSoVatChat) {
		this.coSoVatChat = coSoVatChat;
	}
	public CoSoVatChatSuDung() {
		super();
		// TODO Auto-generated constructor stub
	}
}
