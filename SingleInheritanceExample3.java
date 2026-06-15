package JavaOops;

class phone {
	void apple() {
		System.out.println("Iphone");
	}
}
class android extends phone {
	void samsung() {
		System.out.println("Samsung Phone");
	}
}
public class SingleInheritanceExample3 {
	public static void main(String[] args) {
		android a = new android();
		a.samsung();
		a.apple();
	}
}
