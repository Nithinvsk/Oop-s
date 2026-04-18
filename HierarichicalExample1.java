package JavaOops;

class Animaal {
	void sound() {
		System.out.println("Make Sound");
	}
}
class Doog extends Animaal {
	void bark() {
		System.out.println("Dog Baking");
	}
}
class Caat extends Animaal {
	void sleep() {
		System.out.println("Cat Sleeping");
	}
}
public class HierarichicalExample1 {
	public static void main(String[] args) {
		Doog d = new Doog();
		Caat c = new Caat();
		c.sound();
		c.sleep();
		d.sound();
		d.bark();
	}
}
