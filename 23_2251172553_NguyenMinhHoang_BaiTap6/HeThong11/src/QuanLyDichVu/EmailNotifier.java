package QuanLyDichVu;

public class EmailNotifier implements INotifying {

	@Override
	public void Notify(String message) {
		// TODO Auto-generated method stub
		System.out.println("Gửi thông báo email: " + message);
	}

}
