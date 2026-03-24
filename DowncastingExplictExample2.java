package JavaOops;

class Tables {
	void two() {
		System.out.println("Two Tables");
	}
}
class Tab extends Tables {
	void three() {
		System.out.println("Three Tables");
	}
	void four() {
		System.out.println("Four Tables");
	}
}
public class DowncastingExplictExample2 {
	public static void main(String[] args) {
		Tables t = new Tab();         //upcasting
		Tab nt = (Tab) t;       //Downcasting
		nt.two();
		nt.three();
		nt.four();
	}
}
