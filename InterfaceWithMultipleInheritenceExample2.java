package JavaOops;

interface Animalll {
	void eat();
	void sleep();
}

interface Sound { 
	void makesound();
	void nosound();
}

class Lion implements Animalll,Sound {
	public void eat() {
		System.out.println("Eat");
	}
	public void sleep() {
		System.out.println("Sleep");
	}
	public void makesound() {
		System.out.println("Make Sound");
	}
	public void nosound() {
		System.out.println("No Sound");
	}
}
public class InterfaceWithMultipleInheritenceExample2 {
	public static void main(String[] args) {
		Lion l = new Lion();
		l.eat();
		l.sleep();
		l.makesound();
		l.nosound();
	}
}
