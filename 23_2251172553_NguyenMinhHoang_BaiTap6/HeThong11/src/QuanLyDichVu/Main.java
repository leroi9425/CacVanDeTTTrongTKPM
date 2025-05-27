package QuanLyDichVu;

public class Main {

	public static void main(String[] args) {
		// log
		DailyLog daily_log = new DailyLog();
		WarningNotification warning_noti = new WarningNotification();
		
		// sd adapter de convert
		IService logService = new LogAdapter(daily_log);
		IService notifyService = new NotifyAdapter(warning_noti);
		
		//sd phuong thuc da convert
		logService.Message();
		notifyService.Message();
	}
}
