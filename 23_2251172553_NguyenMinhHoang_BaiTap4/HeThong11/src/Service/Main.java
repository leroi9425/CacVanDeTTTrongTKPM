package Service;

public class Main {

	public static void main(String[] args) {
		ServiceFactory app_factory = new AppServiceFactory();
		
		Login app_login = app_factory.createLogin();
		Notify app_notify = app_factory.createNotify();
		
		System.out.println("----San pham cua app factory----");
		app_login.showMessage();
		app_notify.showMessage();
		
		ServiceFactory web_factory = new WebServiceFactory();
		
		Login web_login = web_factory.createLogin();
		Notify web_notify = web_factory.createNotify();
		
		System.out.println("\n----San pham cua web factory----");
		web_login.showMessage();
		web_notify.showMessage();
	}

}
