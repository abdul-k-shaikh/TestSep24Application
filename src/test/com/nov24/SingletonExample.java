package test.com.nov24;

public class SingletonExample {
	private static SingletonExample instance;

	private SingletonExample() {
		super();
	}

	public static synchronized SingletonExample getInstance() {
		if (instance == null) {
			instance = new SingletonExample();
		}
		return instance;
	}
}
