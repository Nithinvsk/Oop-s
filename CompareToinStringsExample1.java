package JavaOops;

public class CompareToinStringsExample1 {
	public static void main(String[] args) {
		String a = "Apple";
		String b = "Banana";
		String c = "Apple";
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));
		System.out.println(c.compareTo(a));
	}
}
