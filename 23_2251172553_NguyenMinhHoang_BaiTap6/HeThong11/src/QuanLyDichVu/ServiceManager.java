package QuanLyDichVu;

public class ServiceManager implements ILogging, INotifying {

	@Override
	public void Log(String message) {
		// TODO Auto-generated method stub
		System.out.println("Service log: " + message);
	}

	@Override
	public void Notify(String message) {
		// TODO Auto-generated method stub
		System.out.println("Service notify: " + message);
	}

}
