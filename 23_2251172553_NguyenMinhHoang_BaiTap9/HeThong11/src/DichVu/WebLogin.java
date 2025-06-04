package DichVu;

public class WebLogin implements IStrategy {

	@Override
	public void notify(String message) {
		System.out.println("Da login vao web: " + message);
	}
	
}
