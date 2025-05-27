package QuanLyDichVu;

public class LogAdapter implements IService {
	DailyLog log;
	
	public LogAdapter(DailyLog Ilog) {
		log = Ilog;
	}
	@Override
	public void Message() {
		log.dailyLog();
	}
	
}
