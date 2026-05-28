package JavaOops;

class Laptop {
	void hp() {
		System.out.println("HP Laptop");
	}
	void dell() {
		System.out.println("Dell Laptop");
	}
}
class Lap extends Laptop {
	//override
	void hp() {
		super.hp(); //super method to get parent class output
		System.out.println("This is hp Laptop");
	}
	void mac() {
		System.out.println("MacBook");
	}
}
public class PolymorphismOverridingExample2 {
	public static void main(String[] args) {
		Lap l = new Lap();
		l.hp();
		l.dell();
		l.mac();
	}
}
