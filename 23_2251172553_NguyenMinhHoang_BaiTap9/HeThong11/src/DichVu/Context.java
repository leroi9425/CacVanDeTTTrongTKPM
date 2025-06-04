package DichVu;

public class Context {
	public IStrategy strategy;
	
	public void setStrategy(IStrategy Istrategy) {
		strategy = Istrategy;
	}
	public void doNotify() {
		strategy.notify("thanh cong");
	}
}
