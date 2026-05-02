package JavaOops;

import java.util.*;

public class LowerBoundExample2 {
	static void addstring(List<? super String> str) {
		str.add("Nithin");
		str.add("Hari");
		str.add("Chary");
	}
	public static void main(String[] args) {
		List <String> str1 = new ArrayList<>();
		addstring(str1);
		
		List <CharSequence> str2 = new ArrayList<>();
		addstring(str2);
		
		List <Object> str3 = new ArrayList<>();
		addstring(str3);
		
		System.out.println("String List : "+str1);
		System.out.println("CharSequence List : "+str2);
		System.out.println("Object List : "+str3);
	}
}
