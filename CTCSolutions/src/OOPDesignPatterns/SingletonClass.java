package OOPDesignPatterns;

public class SingletonClass {

	private SingletonClass _instance = null;

	// since the constructor already exists, it cannot be accessed publicaly.
	private SingletonClass() {
	}

	public SingletonClass getInstance() throws SingletonErrorException {
		if (_instance == null) {
			_instance = new SingletonClass();
			return _instance;
		} else {
			throw new SingletonErrorException("Object Already exists!");
		}
	}
}
