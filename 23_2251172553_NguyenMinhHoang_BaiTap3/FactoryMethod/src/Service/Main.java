package Service;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// tạo nhật ký
		ServiceFactory LogCreator = new LogFactory();
		LogCreator.showMessage();
		
		// tạo thông báo
		ServiceFactory NotifyCreator = new NotifyFactory();
		NotifyCreator.showMessage();
	}

}
