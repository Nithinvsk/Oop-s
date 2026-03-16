package JavaOops;

import java.util.*;
import java.util.function.*;

public class ConsumerExample2 {
	public static void main(String[] args) {
		List <String> names = Arrays.asList("Nithin","Teju");
		Consumer<String> str = n -> System.out.println("Hello : "+n);
		
		names.forEach(str);
	}
}
