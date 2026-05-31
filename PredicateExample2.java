package JavaOops;

import java.util.*;
import java.util.function.Predicate;

public class PredicateExample2 {
	public static void main(String[] args) {
		Predicate<Integer> isEven = n -> n % 2 == 0;
		Predicate<Integer> isPositive = n -> n > 0;
		
		System.out.println(isEven.and(isPositive).test(8));
		System.out.println(isEven.or(isPositive).test(-8));
		System.out.println(isEven.negate().test(8));
		System.out.println(isEven.negate().test(7));
	}
}
