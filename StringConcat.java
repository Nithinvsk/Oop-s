package JavaOops;

public class StringConcat {
	public static void main(String[] args) {
		String s = "Nithin"; //static memory
		s = s.concat("Chary");// Here, string s is updating
		System.out.println(s);
	}
}
