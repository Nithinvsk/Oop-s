package JavaOops;

class InvalidMarksException extends Exception {
	InvalidMarksException(String message) {
		super(message);
	}
}

public class StudentResultManagementException {
	static void checkmarks(int marks) throws InvalidMarksException {
		if (marks < 0 || marks > 100) {
			throw new InvalidMarksException("Marks Cannot to be Negative or Greater than 100");
		}
		else {
			if (marks >= 90) {
				System.out.println("Grade : A");
			}
			else if (marks >= 75 && marks <= 90) {
				System.out.println("Grade : B");
			}
			else if (marks >= 50 && marks <= 75) {
				System.out.println("Grade : C");
			}
			else {
				System.out.println("Grade : Fail");
			}
		}
	}
	public static void main(String[] args) {
		try {
			checkmarks(99);
			checkmarks(169);
		}
		catch (InvalidMarksException nt) {
			System.out.println("Exception Caught : "+nt.getMessage());
			System.out.println(nt.toString());
		}
		/*try {
			checkmarks(169);
		}
		catch (InvalidMarksException nt) {
			System.out.println("Exception Caught : "+nt.getMessage());
			System.out.println(nt.toString());
		}*/
		finally {
			System.out.println("Result processed");
		}
	}
}
