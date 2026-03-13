package JavaOops;

class Student {
	String name;
	int roll;
	
	Student() {
		this.name = name;
		this.roll = roll;
	}
}
public class Constructors {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "Nithin";
		s.roll = 8;
		System.out.println("Name : "+s.name);
		System.out.println("Roll : "+s.roll);
	}
}
