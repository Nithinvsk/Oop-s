package JavaOops;

import java.util.*;

class Stu {
	String name;
	int marks;
	
	Stu (String name, int marks){
		this.name = name;
		this.marks = marks;
	}
	public String toString() {
		return name + " -> " + marks;
	}
}

public class LambdaExpressionExample2 {
	public static void main(String[] args) {
		ArrayList<Stu> s = new ArrayList<>();
		s.add(new Stu("Nithin",90));
		s.add(new Stu("Hari",95));
		
		System.out.println("Before Sorting");
		s.forEach(System.out::println);
		
		System.out.println("Name Sorting");
		s.sort((s1,s2) -> s1.name.compareTo(s2.name));
		s.forEach(System.out::println);
		
		System.out.println("Age Sorting");
		s.sort((s1,s2) -> s1.marks -s2.marks);
		s.forEach(System.out::println);
	}
}
