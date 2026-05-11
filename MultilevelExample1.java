package JavaOops;

class Ani {
	void sound() {
		System.out.println("Make Sound");
	}
}
class Dog1 extends Ani {
	void eat() {
		System.out.println("Eat");
	}
}
class Lab extends Dog1 {
	void bark() {
		System.out.println("Barking");
	}
}
public class MultilevelExample1 {
	public static void main(String[] args) {
		Lab l = new Lab();
		l.sound();
		l.eat();
		l.bark();
	}
}
