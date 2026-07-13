package JavaOops;

public class ThrowsException2 {
	static void division(int a,int b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException("Division By Zero");
		}
		else {
			int result = a / b;
			System.out.println(result);
		}
	}
	public static void main(String[] args) {
		try {
			division(10,0);
		}
		catch (ArithmeticException nt) {
			System.out.println("Exception Caught : "+nt.getMessage());
		}
	}
}
