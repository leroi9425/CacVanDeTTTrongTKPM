package QuanLyDichVu;

import java.util.Objects;

public class ServiceMediator implements IMediator {
	public Log log = new Log();
	public Notify notify = new Notify();
	public HandleVirus hvirus = new HandleVirus();
	public ScanVirus svirus = new ScanVirus();
	
	@Override
	public void notify(Object sender) {
		if(sender == svirus) {
			System.out.println("Mediator react scan virus va thuc hien:");
			notify.updateNotify();
			log.uodateLog();
		}
		if(sender == hvirus) {
			System.out.println("Mediator react handle virus va thuc hien:");
			notify.updateNotify();
			log.uodateLog();
		}
	}
}
