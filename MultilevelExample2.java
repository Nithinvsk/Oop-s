package JavaOops;

class Gold {
	void goldd() {
		System.out.println("GOLD");
	}
}
class Silver extends Gold {
	void silverr() {
		System.out.println("SILVER");
	}
}
class Copper extends Silver {
	void copperr() {
		System.out.println("COPPER");
	}
}
public class MultilevelExample2 {
	public static void main(String[] args) {
		Copper c = new Copper();
		c.goldd();
		c.silverr();
		c.copperr();
	}
}
