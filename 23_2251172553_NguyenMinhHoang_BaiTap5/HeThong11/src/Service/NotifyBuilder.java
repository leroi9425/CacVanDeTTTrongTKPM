package Service;

public class NotifyBuilder implements ServiceBuilder {
	Notify notify = new Notify();

	@Override
	public void reset() {
		notify = new Notify();
	}

	@Override
	public void buildColor() {
		notify.corlor = "red";
	}

	@Override
	public void buildFont() {
		notify.font = "Calibri";
	}

	@Override
	public void buildSize() {
		notify.size = 20;
	}
	
	public Notify getResult() {
		return notify;
	}
}
