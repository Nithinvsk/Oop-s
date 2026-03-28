package JavaOops;

public class EqualsinString {
	public static void main(String[] args) {
		String a = "Nithin";
		String b = "Nithin";
		System.out.println(a == b); // true because of this two strings are related to same static memory as well as same content in string
		String c = new String("Nithin");
		System.out.println(a == c); // false because of one string is related to static memory and another string related to heap Memeory
	}
}
