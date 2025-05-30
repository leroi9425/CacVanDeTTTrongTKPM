package QuanLyDichVu;

public class Log implements IService {

	@Override
	public void timeCreate() {
		System.out.println("nhat ky duoc tao luc 10h");
	}

	@Override
	public void timeUpdate() {
		System.out.println("nhat ky duoc cap nhat luc 10h");
	}

	@Override
	public void message() {
		System.out.println("hom nay ban da dang ky goi 4g");
	}

}
