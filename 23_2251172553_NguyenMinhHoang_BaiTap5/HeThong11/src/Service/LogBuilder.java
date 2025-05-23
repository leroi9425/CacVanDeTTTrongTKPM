package Service;

public class LogBuilder implements ServiceBuilder {
	Log log = new Log();

	@Override
	public void reset() {
		log = new Log();
	}

	@Override
	public void buildColor() {
		log.corlor = "black";
	}

	@Override
	public void buildFont() {
		log.font = "Times new roman";
	}

	@Override
	public void buildSize() {
		log.size = 13;
	}
	
	public Log getResult() {
		return log;
	}
}
