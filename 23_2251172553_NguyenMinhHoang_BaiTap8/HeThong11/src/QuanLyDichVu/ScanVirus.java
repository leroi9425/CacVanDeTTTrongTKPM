package QuanLyDichVu;

public class ScanVirus {
	public IMediator m;
	public void scan() {
		System.out.println("quet duoc virus");
		m.notify(this);
	}
}
