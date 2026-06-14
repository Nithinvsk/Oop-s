package JavaOops;

class goldshop {
	void gold() {
		System.out.println("Gold");
	}
}
class skg extends goldshop {
	void silver() {
		System.out.println("Silver");
	}
}
public class SingleInheritanceExample2 {
	public static void main(String[] args) {
	    skg shop = new skg();
		shop.gold();
		shop.silver();
	}
}
