package JavaOops;

public class ThrowException1 {
	static void checkage(int age) {
		if (age < 18) {
			throw new ArithmeticException ("Not Eligible");
		}
		else {
			System.out.println("Eligible");
		}
	}
	public static void main(String[] args) {
		try {
			checkage(15);
		}
		catch (ArithmeticException nt) {
			System.out.println("Exception Caught : " +nt.getMessage());
		}
		System.out.println("Program Ended");
	}
}
