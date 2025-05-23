package Service;

public class ServiceDirector {
	private ServiceBuilder service;
	
	public ServiceDirector(ServiceBuilder Iservice) {
		service = Iservice;
	}
	
	public void changeServiceBuilder(ServiceBuilder Cservice) {
		service = Cservice;
	}
	
	public void make() {
		service.buildColor();
		service.buildFont();
		service.buildSize();
	}
	
}
