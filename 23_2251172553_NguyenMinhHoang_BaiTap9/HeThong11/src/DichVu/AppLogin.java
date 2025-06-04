package DichVu;

public class AppLogin implements IStrategy {

	@Override
	public void notify(String message) {
		System.out.println("Da login vao app: " + message);
	}

}
