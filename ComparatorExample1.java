package JavaOops;

import java.util.*;

class Student1 {
	String name;
	int marks;
	
	Student1 (String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
	
	public String toString() {
		return name + " -> " + marks;
	}
}
class NameSort implements Comparator<Student1> {
	public int compare(Student1 s1, Student1 s2) {
		return s1.name.compareTo(s2.name);
	}
}
class MarksSort implements Comparator<Student1> {
	public int compare(Student1 s1, Student1 s2) {
		if (s1.marks < s2.marks) {
			return 1;
		}
		else if (s1.marks > s2.marks) {
			return -1;
		}
		else {
			return 0;
		}
	}
}

public class ComparatorExample1 {
	public static void main(String[] args) {
		ArrayList<Student1> s = new ArrayList<>();
		s.add(new Student1("Teju",87));
		s.add(new Student1("Nithin",95));
		s.add(new Student1("Chary",75));
		
		System.out.println("Before Sorting");
		for (Student1 st : s) {
			System.out.println(st);
		}
		
		Collections.sort(s,new NameSort());
		System.out.println("Name Sorting");
		for (Student1 st : s) {
			System.out.println(st);
		}
		
		Collections.sort(s,new MarksSort());
		System.out.println("Marks Descending Sorting");
		for (Student1 st : s) {
			System.out.println(st);
		}
	}
}
