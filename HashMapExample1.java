package JavaOops;

import java.util.*;

public class HashMapExample1 {
	public static void main(String[] args) {
		HashMap <Integer,String> student = new HashMap <>();
		
		student.put(1, "Nithin");
		student.put(2, "Chary");
		student.put(3, "Hari");
		student.put(4, "Krishna");
		student.put(5, "Nithin"); // Duplicate value is allowed.
		System.out.println("HashMap : "+student);
		System.out.println("Accessing 3rd student : "+student.get(3));
		
		student.remove(5);
		System.out.println("HashMap : "+student);
		
		System.out.println("Contains Key 3 ? : "+student.containsKey(3));
		System.out.println("Contains Value Nithin ? : "+student.containsValue("Nithin"));
		
		System.out.println("Key's : "+student.keySet());
		System.out.println("Value's : "+student.values());
		
		System.out.println("Map Size : "+student.size());
		
		for (Map.Entry<Integer, String> nt : student.entrySet()) {
			System.out.println(nt.getKey() + "->" + nt.getValue());
		}
		
	}
}
