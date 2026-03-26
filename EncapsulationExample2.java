package JavaOops;

class Peerson1 {
	private String name;
	 String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
}
public class EncapsulationExample2 {
	public static void main(String[] args) {
		Peerson1 p = new Peerson1();
		p.setName("Nithin");
		System.out.println("Name is "+p.getName());
	}
}
