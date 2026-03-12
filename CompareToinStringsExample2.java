package JavaOops;

public class CompareToinStringsExample2 {
	public static void main(String[] args) {
		String a = "Apple";
		String b = "Banana";
		String c = "apple";
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));
		System.out.println(c.compareTo(a)); // ASIIC value of a-A = 97-65 = 32
		System.out.println(c.compareToIgnoreCase(a)); // it ignores the Case
	}
}
