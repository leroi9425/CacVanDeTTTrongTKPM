package QuanLyDichVu;

public class HandleVirus {
	public IMediator m;
	public void killVirus() {
		System.out.println("da tieu diet virus");
		m.notify(this);
	}
}
