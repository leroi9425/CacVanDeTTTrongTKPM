package Service;

public class AppServiceFactory implements ServiceFactory {

	@Override
	public Login createLogin() {
		return new AppLogin();
	}

	@Override
	public Notify createNotify() {
		return new AppNotify();
	}

}
