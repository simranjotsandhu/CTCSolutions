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
		}
		return _instance;
	}

	public static boolean isPalindrome(int data){
		   int temp = data; 
		   int reverse = 0;
		       while(temp!=0){
		           reverse <<= 1;
		           reverse |= (temp & 1);
		           temp >>= 1;
		         }
		    return (reverse == data);
		}
}
