package JavaOops;

import java.util.*;
import java.util.function.*;

public class ConsumerExample3 {
	public static void main(String[] args) {
		Consumer <String> str = n -> System.out.println("Upper Case : "+n.toUpperCase());
		Consumer <String> str1 = n -> System.out.println("Lower Case : "+n.toLowerCase());
		
		Consumer <String> combined = str.andThen(str1);
		combined.accept("Nithin");
	}
}
