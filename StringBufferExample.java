package JavaOops;

public class StringBufferExample {
	public static void main(String[] args) {
		StringBuffer nt = new StringBuffer("Nithin");
		
		nt.append(" Chary");
		System.out.println(nt);
		
		nt.insert(0,"Kammari");
		System.out.println(nt);
		
		nt.replace(14, 19, "Krishna");
		System.out.println(nt);
		
		nt.delete(0, 7);
		System.out.println(nt);
		
		nt.reverse();
		System.out.println(nt);
		
	}
}
