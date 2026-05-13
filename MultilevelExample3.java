package JavaOops;

class Veh {
	void stop() {
		System.out.println("Engine Stopped");
	}
}
class Buss extends Veh {
	void start() {
		System.out.println("Started");
	}
}
class Carr extends Buss {
	void breaked() {
		System.out.println("Break vehicle");
	}
}
public class MultilevelExample3 {
	public static void main(String[] args) {
		Carr c = new Carr();
		c.start();
		c.breaked();
		c.stop();
	}
}
