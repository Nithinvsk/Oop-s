package JavaOops;
class Person {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class ExcapsulationExample1 {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Nithin");
		p.setAge(19);
		System.out.println("Name is "+p.getName());
		System.out.println("Age is "+p.getAge());
	}
}
