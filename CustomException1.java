package JavaOops;

class InvalidAccessException extends Exception {
	InvalidAccessException(String message) {
		super(message);
	}
}


public class CustomException1 {
	static void checkage(int age) throws InvalidAccessException {
		if ( age < 18) {
			throw new InvalidAccessException("Must be 18 to eligible to vote");
		}
		else {
			System.out.println("Eligible to vote");
		}
	}
	public static void main(String[] args) {
		try {
			checkage(16);
		}
		catch (InvalidAccessException nt) {
			System.out.println("Exception Caught : "+nt.getMessage());
			System.out.println(nt.toString());
		}
	}
}
