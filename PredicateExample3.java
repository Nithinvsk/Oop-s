package JavaOops;

import java.util.*;
import java.util.function.Predicate;

public class PredicateExample3 {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("Nithin","Nikhil","Ravi");
		Predicate<String> str1 = name -> name.startsWith("N");
		
		for (String name : str) {
			if (str1.test(name)) {
			System.out.println(name);
			}
		}
	}
}
