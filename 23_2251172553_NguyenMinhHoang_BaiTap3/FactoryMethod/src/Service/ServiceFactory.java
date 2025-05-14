package Service;

public abstract class ServiceFactory {
	
	public void showMessage() {
		Service sv = createService();
		sv.showMessage();
	}
	public abstract Service createService();
}
