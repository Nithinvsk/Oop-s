package JavaOops;

import java.util.*;

public class LinkedListExample1 {
	public static void main(String[] args) {
		LinkedList <String> str = new LinkedList <> ();
		
		str.add("Nithin");
		str.add("Chary");
		str.add("Tejuu");
		str.add("Goud");
		str.addFirst("Kammari");
		str.addLast("Minny");
		
		System.out.println("Names List : "+str);
		System.out.println("First Name : "+str.getFirst());
		System.out.println("Last Name : "+str.getLast());
		System.out.println("List Size : "+str.size());
		
		str.remove();
		str.remove(1);
		str.removeLast();
		
		System.out.println("Names List : "+str);
		
		System.out.println("Third Name : "+str.get(1));
		System.out.println("Contains Tejuu ? : "+str.contains("Tejuu"));
	}
}
