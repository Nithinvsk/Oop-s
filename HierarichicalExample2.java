package JavaOops;

class Wine {
	void drink() {
		System.out.println("Drink Wine");
	}
}
class Jemson extends Wine {
	void no() {
		System.out.println("Don't Drink Wine");
	}
}
class Pepers100 extends Wine {
	void Dont() {
		System.out.println("Dont drink 100 Pepers");
	}
}
public class HierarichicalExample2 {
	public static void main(String[] args) {
		Jemson j = new Jemson();
		Pepers100 p = new Pepers100();
		j.drink();
		j.no();
		p.drink();
		p.Dont();
	}
}
