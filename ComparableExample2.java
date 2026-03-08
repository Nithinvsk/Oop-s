package JavaOops;

import java.util.*;

class Emp implements Comparable<Emp> {
	String name;
	int age;
	
	Emp (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(Emp other) {
		return this.name.compareTo(other.name);
	}
	
	public String toString() {
		return  name + " " +age;
	}
}

public class ComparableExample2 {
	public static void main(String[] ags) {
		ArrayList<Emp> e = new ArrayList<>();
		e.add(new Emp("Teju",19));
		e.add(new Emp("Nithin",19));
		
		System.out.println("Before Sorting");
		for (Emp employee : e) {
			System.out.println(employee);
		}
		
		Collections.sort(e);
		
		System.out.println("After Sorting");
		for (Emp employee : e) {
			System.out.println(employee);
		}
	}
}
