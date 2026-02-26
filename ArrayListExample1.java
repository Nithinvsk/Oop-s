package JavaOops;

import java.util.*;

public class ArrayListExample1 {
	public static void main(String[] args) {
		ArrayList <String> str = new ArrayList <>();
		str.add("Nithin");
		str.add("Tejuu");
		str.add("March 17");
		str.add("Tejuu");    //Duplicate allowed.
		
		System.out.println("Names List : " +str);
		System.out.println("Second Name : " +str.get(1));
	}
}
