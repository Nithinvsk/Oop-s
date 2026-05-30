package JavaOops;

import java.util.*;
import java.util.function.Predicate;

public class PredicatorExample1 {
	public static void main(String[] args) {
		Predicate<Integer> isEven = n -> n % 2 == 0;
		
		System.out.println(isEven.test(8));
		System.out.println(isEven.test(9));
	}
}
