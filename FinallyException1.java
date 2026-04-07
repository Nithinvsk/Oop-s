package JavaOops;

public class FinallyException1 {
	 public static void main(String[] args) {
	        try {
	            String a = null;
	            System.out.println(a.charAt(0)); 
	        }
	        catch (NullPointerException e) {
	            System.out.println("Null Pointer Exception"); 
	        }
	        finally {
	        	System.out.println("Try & Catch Block Exceuted");
	        }
	 }
}
