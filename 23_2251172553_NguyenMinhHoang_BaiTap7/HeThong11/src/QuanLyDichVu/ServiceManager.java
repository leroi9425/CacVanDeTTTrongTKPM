package QuanLyDichVu;

public class ServiceManager {
	private IService service;
	
	public ServiceManager(IService Iservice) {
		service = Iservice;
	}
	
	public void post() {
		service.timeCreate();
		service.message();
	}
	public void information() {
		service.timeCreate();
		service.timeUpdate();
	}
}
