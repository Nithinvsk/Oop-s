package JavaOops;

interface Animalnt {  
	void sound();     
	void eat();
}
class Dognt implements Animalnt {     
	public void sound() {
		System.out.println("Dog Make Sound");
	}
	public void eat() {
		System.out.println("Dog Eats");
	}
}
class  Catnt implements Animalnt {     
	public void sound() {
		System.out.println("Cat Make Sound");
	}
	public void eat() {
		System.out.println("Cat Eats");
	}
}
public class InterfaceExample1 {
	public static void main(String[] args) {
		Dognt d = new Dognt();
		Catnt c = new Catnt();
		d.sound();
		d.eat();
		c.sound();
		c.eat();
	}
}
