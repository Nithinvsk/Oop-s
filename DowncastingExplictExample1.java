package JavaOops;

class Table {
	void ring() {
		System.out.println("This is Ring");
	}
}
class Table1 extends Table {
	void nacklace() {
		System.out.println("Necklace");
	}
	void chain() {
		System.out.println("Chain");
	}
}
public class DowncastingExplictExample1 {
	public static void main(String[] args) {
		Table t = new Table1();         //upcasting
		Table1 nt = (Table1) t;       //Downcasting
		nt.nacklace();
		nt.chain();
		nt.ring();
	}
}
