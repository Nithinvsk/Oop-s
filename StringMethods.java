package JavaOops;

public class StringMethods {
	public static void main(String[] args) {
		String s = " Nithin Chary ";
		System.out.println("Original : "+s);
		
		System.out.println("Length : "+s.length());
		
		System.out.println("Char At : "+s.charAt(3));
		
		System.out.println("Concat : "+s.concat("Chary"));
		
		System.out.println("Nithin".equals("nithin"));
		
		System.out.println("Nithin".equalsIgnoreCase("nithin"));
		
		System.out.println("Substring : "+s.substring(1,7));
		
		System.out.println("Lower : "+s.toLowerCase());
		
		System.out.println("Upper : "+s.toUpperCase());
		
		System.out.println("Trim : "+s.trim());
		
		System.out.println("Replace : "+s.replace('N','n'));
		
		System.out.println("Index of char : "+s.indexOf('t'));
		
		System.out.println("Contains : "+s.contains("Chary"));
	}
}
