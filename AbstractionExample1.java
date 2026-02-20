package JavaOops;

abstract class Animal {
	abstract void MakeSound();
	void sleep() {
		System.out.println("Dog Sleeping...");
	}
}
class Dog extends Animal {
	void MakeSound() {
		System.out.println("Barking...");
	}
}
class Cat {
	void MakeSound() {
		System.out.println("Meow...");
	}
}
public class AbstractionExample1 {
	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		d.MakeSound();
		d.sleep();
		c.MakeSound();
		//c.sleep();
	}
}
