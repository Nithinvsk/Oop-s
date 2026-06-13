package JavaOops;

class Animall {
	void eat() {
		System.out.println("Eating");
	}
}
class Dogg extends Animall {
	void bark() {
		System.out.println("Barking");
	}
}
public class SingleInheritanceExample1 {
	public static void main(String[] args) {
	    Dogg d = new Dogg();
		d.eat();
		d.bark();
	}
}
