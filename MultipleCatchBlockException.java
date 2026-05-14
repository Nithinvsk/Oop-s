package JavaOops;

public class MultipleCatchBlockException {
	public static void main(String[] args) {
		        try {
		            int x = 10/10;
		            System.out.println(x);
		            int a[] = new int[5];
		            System.out.println(a[3]);
		            String str = null;
		            System.out.println(str.length());
		        }
		        catch (ArithmeticException nt) {
		            System.out.println(nt);
		        }
		         catch (ArrayIndexOutOfBoundsException nt) {
		            System.out.println(nt);
		        }
		        catch (NullPointerException nt) {
		            System.out.println(nt);
		        }
		        System.out.println("Exception Completed");
	}
}
