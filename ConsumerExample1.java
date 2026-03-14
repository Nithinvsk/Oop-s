package JavaOops;

import java.util.*;
import java.util.function.*;

public class ConsumerExample1 {
	public static void main(String[] args) {
		Consumer<Integer> num = n -> System.out.println("Number : "+n);
		
		num.accept(8);
		num.accept(26);
		num.accept(17);
	}
}
