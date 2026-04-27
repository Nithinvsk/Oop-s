package JavaOops;

import java.util.*;

class Emmp {
	String name;
	int age;
	double salary;
	
	Emmp (String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String toString() {
		return name + " -> " + age + " -> " +salary;
	}
}
public class LambdaExpressionExample1 {
	public static void main(String[] args) {
		ArrayList<Emmp> e = new ArrayList<>();
		e.add(new Emmp("Nithin",19,200000));
		e.add(new Emmp("Hari",22,300000));
		e.add(new Emmp("Chary",20,100000));
		
		System.out.println("Before Sorting");
		e.forEach(System.out::println);
		
		System.out.println("Name Sorting");
		e.sort((e1,e2) -> e1.name.compareTo(e2.name));
		e.forEach(System.out::println);
		
		System.out.println("Age Sorting Descending");
		e.sort((e1,e2) -> e2.age - e1.age);
		e.forEach(System.out::println);
		
		System.out.println("Salary Sorting");
		e.sort((e1,e2) -> Double.compare(e1.salary,e2.salary));
		e.forEach(System.out::println);
	}
}
