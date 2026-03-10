package JavaOops;

import java.util.*;

class Empp {
	String name;
	double salary;
	
	Empp (String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return name + " -> " + salary;
	}
}
class NameeSort implements Comparator<Empp> {
	public int compare(Empp e1, Empp e2) {
		return e1.name.compareTo(e2.name);
	}
}
class SalarySort implements Comparator<Empp> {
	public int compare(Empp e1, Empp e2) {
		return Double.compare(e2.salary, e1.salary);
	}
}

public class ComparatorExample2 {
	public static void main(String[] args) {
		ArrayList<Empp> e = new ArrayList<>();
		e.add(new Empp("Nithin",10000000));
		e.add(new Empp("Hari",12345678));
		
		System.out.println("Before Sorting");
		for (Empp emp : e) {
			System.out.println(emp);
		}
		System.out.println("Name Sorting");
		Collections.sort(e,new NameeSort());
		for (Empp emp : e) {
			System.out.println(emp);
		}
		System.out.println("Salary Sorting");
		Collections.sort(e,new SalarySort());
		for (Empp emp : e) {
			System.out.println(emp);
		}
	}
}
