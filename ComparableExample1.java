package JavaOops;

import java.util.*;

 class Stud implements Comparable<Stud> {
	int roll;
	String name;
	int marks;
	
	Stud (int roll, String name, int marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	public int compareTo(Stud other) {
		return this.marks - other.marks;
	}
	
	public String toString() {
		return roll + "-" + name + "-" + marks;
	}
}

public class ComparableExample1 {
	public static void main(String[] args) {
		ArrayList<Stud> s = new ArrayList<>();
		s.add(new Stud(1,"Nithin",80));
		s.add(new Stud(2,"Teju",93));
		s.add(new Stud(3,"Chary",85));
		
		System.out.println("Before Sorting");
		for (Stud n : s) {
			System.out.println(n);
		}
		
		Collections.sort(s);
		
		System.out.println("After Sorting");
		for (Stud n : s) {
			System.out.println(n);
		}
	}
}
