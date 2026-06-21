package JavaOops;

public class StringImmutable {
	public static void main(String[] args) {
		String s = "Nithin"; //static memory or string pool
		s.concat("Chary"); //Here, string is s is not updated
		System.out.println(s);
	}
}
