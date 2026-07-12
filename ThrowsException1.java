package JavaOops;

public class ThrowsException1 {
	static void fun() throws IllegalAccessException {
		System.out.println("Inside Fun");
		throw new IllegalAccessException("Have Fun");
	}
	public static void main(String[] args) {
		try {
			fun();
		}
		catch (IllegalAccessException nt) {
			System.out.println(nt.getMessage());
		}
	}
}
