package JavaOops;

public class ExceptionError2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 5;
		int x,y;
		try {
			x = a / (b-c);
		}
		catch (ArithmeticException nt) {
			System.out.println("Divisible by Zero");
		}
		
		y = a / (b+c);
		System.out.println(y);	
	}
}
