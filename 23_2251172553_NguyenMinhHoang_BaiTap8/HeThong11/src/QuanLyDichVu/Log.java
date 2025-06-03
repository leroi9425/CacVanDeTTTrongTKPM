package QuanLyDichVu;

public class Log {
	public IMediator m;
	public void uodateLog() {
		System.out.println("Cap nhat nhat ky");
		m.notify(this);
	}
}
