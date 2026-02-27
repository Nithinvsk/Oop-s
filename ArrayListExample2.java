package JavaOops;

import java.util.*;

public class ArrayListExample2 {
	public static void main(String[] args) {
		ArrayList <String> str = new ArrayList <>();
		str.add("Nithin");
		str.add("Tejuu");
		str.add("March 17");
		
		System.out.println("Names List : " +str);
		System.out.println("Second Name : " +str.get(1));
		System.out.println("Contains Tejuu ? : " +str.contains("Tejuu"));
		System.out.println("Replace : " +str.set(2, "Feb 08"));
		
		str.add(2, "Oct 05");
		System.out.println("After add at Specific index : " +str);
		
		System.out.println("Size of ArrayList : " +str.size());
		
		str.remove(2);
		System.out.println("After Removing Names List: " +str);
		
		System.out.println("After Removing Size of ArrayList : " +str.size());
		System.out.println("Check List is Empty : " +str.isEmpty());
	}
}
