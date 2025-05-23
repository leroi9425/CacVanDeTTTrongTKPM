package Service;

public class Main {

	public static void main(String[] args) {
		// tao log
		LogBuilder log_service = new LogBuilder();
		ServiceDirector SDirector = new ServiceDirector(log_service);
		
		SDirector.make();
		Log log = log_service.getResult();
		log.show();
		
		// tao notify
		NotifyBuilder notify_service = new NotifyBuilder();
		
		SDirector.changeServiceBuilder(notify_service);
		SDirector.make();
		Notify notify = notify_service.getResult();
		notify.show();
	}

}
