package QuanLyDichVu;

public class Notify {
	public IMediator m;
	public void updateNotify() {
		System.out.println("Cap nhat thong bao");
		m.notify(this);
	}
}
