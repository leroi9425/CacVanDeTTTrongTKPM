package NhanSu;

public class NhanVienBanThoiGian extends NhanVien {
	public NhanVienBanThoiGian() {}
	public NhanVienBanThoiGian(String Ten, int GioLam) {
		super(Ten, GioLam);
	}
	
	public int TinhLuong() {
		return 30000 * getGioLam();
	}
}
