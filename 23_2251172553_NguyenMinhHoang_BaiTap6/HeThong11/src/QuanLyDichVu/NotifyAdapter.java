package QuanLyDichVu;

public class NotifyAdapter implements IService {
	WarningNotification notify;
	
	public NotifyAdapter(WarningNotification Inotify) {
		notify = Inotify;
	}
	@Override
	public void Message() {
		notify.warning();
	}
	
}
