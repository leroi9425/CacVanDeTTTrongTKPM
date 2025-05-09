package NhanSu;

public class NhanVienToanThoiGian extends NhanVien{
	public NhanVienToanThoiGian() {}
	public NhanVienToanThoiGian(String Ten, int GioLam) {
		super(Ten, GioLam);
	}
	
	public int TinhLuong() {
		return 50000 * getGioLam();
	}
}
