package Service;

public class NotifyFactory extends ServiceFactory {

	@Override
	public Service createService() {
		// TODO Auto-generated method stub
		return new Notify();
	}

}
