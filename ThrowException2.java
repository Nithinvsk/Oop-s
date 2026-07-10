package JavaOops;

public class ThrowException2 {
	static void valid(String name, String password) {
		if (!name.equals("Nithin") || !password.equals("0826")) {
			throw new SecurityException("Invalid Name and Password");
		}
		else {
			System.out.println("Valid Name and Password");
		}
	}
	public static void main(String[] args) {
		try {
			valid("Nithin","0826");
		}
		catch (SecurityException nt) {
			System.out.println("Exception Caught : "+nt.getMessage());
		}
		try {
			valid("Teju","0826");
		}
		catch (SecurityException nt) {
			System.out.println("Exception Caught : "+nt.getMessage());
		}
	}
}
