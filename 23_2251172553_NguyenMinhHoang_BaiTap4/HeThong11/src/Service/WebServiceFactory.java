package Service;

public class WebServiceFactory implements ServiceFactory {

	@Override
	public Login createLogin() {
		return new WebLogin();
	}

	@Override
	public Notify createNotify() {
		return new WebNotify();
	}
	
}
