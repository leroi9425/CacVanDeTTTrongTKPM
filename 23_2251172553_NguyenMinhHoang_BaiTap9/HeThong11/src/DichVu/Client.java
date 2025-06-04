package DichVu;

public class Client {

	public static void main(String[] args) {
		Context context = new Context();
		WebLogin web_login = new WebLogin();
		AppLogin app_login = new AppLogin();
		
		System.out.println("web strategy");
		context.setStrategy(web_login);
		context.doNotify();
		
		System.out.println();
		System.out.println("app strategy");
		context.setStrategy(app_login);
		context.doNotify();
	}

}
