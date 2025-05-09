package QuanLyDichVu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileLogger file_log = new FileLogger();
		EmailNotifier email_noti = new EmailNotifier();
		ServiceManager service_mana = new ServiceManager();
		
		file_log.Log("File logger");
		email_noti.Notify("Email notify");
		service_mana.Log("service log");
		service_mana.Notify("service notify");
	}
}
