package JavaOops;

class Nithin1 {
	void rich() {
		System.out.println("Rich");
	}
}
class Nt1 extends Nithin1 {
	void poor() {
		System.out.println("Poor");
	}
}
public class UpcastingExplictExample2 {
	public static void main(String[] args) {
		Nithin1 n = new Nt1();         // upcasting
		n.rich();             // Calls Dog's version (runtime polymorphism)
		//n.poor();       // Not accessible (since reference is Animal)
	}
}
