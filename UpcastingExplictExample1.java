package JavaOops;

class Nithin {
	void rich() {
		System.out.println("Rich");
	}
}
class Nttt extends Nithin {
	void rich() {
		System.out.println("Rich NT");
	}
	void poor() {
		System.out.println("Poor");
	}
}
public class UpcastingExplictExample1 {
	public static void main(String[] args) {
		Nithin n = new Nttt();   // Upcasting 
		n.rich();             // Calls Dog's version (runtime polymorphism)
		//n.poor();       // Not accessible (since reference is Animal)
	}
}
