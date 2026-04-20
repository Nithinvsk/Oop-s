package JavaOops;

class Caar {
	void door() {
		System.out.println("Door Opens");
	}
}
class BMW extends Caar {
	void barnet() {
		System.out.println("Barnet Opens");
	}
}
class Benz extends Caar {
	void wheel() {
		System.out.println("Car Wheels");
	}
}
public class HierarichicalExample3 {
	public static void main(String[] args) {
		BMW b = new BMW();
		Benz z = new Benz();
		b.door();
		b.barnet();
		z.door();
		z.wheel();
	}
}
