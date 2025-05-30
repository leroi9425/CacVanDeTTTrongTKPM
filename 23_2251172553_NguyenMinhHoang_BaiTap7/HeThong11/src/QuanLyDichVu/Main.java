package QuanLyDichVu;

public class Main {

	public static void main(String[] args) {
		IService log = new Log();
		ServiceManager log_service = new ServiceManager(log);
		log_service.post();
		
		IService notify = new Notify();
		ServiceManager notify_service = new ServiceManager(notify);
		notify_service.information();
	}

}
