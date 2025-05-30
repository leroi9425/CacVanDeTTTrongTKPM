package QuanLyDichVu;

public class Notify implements IService {

	@Override
	public void timeCreate() {
		System.out.println("thong bao duoc tao luc 10h truoc");
	}

	@Override
	public void timeUpdate() {
		System.out.println("thong bao duoc cap nhat luc 10h truoc");
	}

	@Override
	public void message() {
		System.out.println("thong bao: ban co goi qua chua nhan");
	}

}
