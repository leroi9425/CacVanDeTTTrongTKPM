package QuanLyDichVu;

public class Main {
	public static void main(String[] args) {
		//tao thanh phan
		Log log = new Log();
		Notify notify = new Notify();
		HandleVirus hvirus = new HandleVirus();
		ScanVirus svirus = new ScanVirus();
		
		//tao mediator
		ServiceMediator mediator = new ServiceMediator();
		mediator.log = log;
		mediator.notify = notify;
		mediator.hvirus = hvirus;
		mediator.svirus = svirus;
		
		//dat mediator cho cac thanh phan
		log.m = mediator;
		notify.m = mediator;
		hvirus.m = mediator;
		svirus.m = mediator;
		
		// chay thu
		System.out.println("bat dau scan virus");
		svirus.scan();
		
		System.out.println();
		System.out.println("bat dau xu ly virus");
		hvirus.killVirus();
	}
}
