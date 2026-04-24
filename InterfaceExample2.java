package JavaOops;

interface vehc {
	void start();
	void stop();
}
class bike implements vehc {
	public void start() {
		System.out.println("Bike Started");
	}
	public void stop() {
		System.out.println("Bike Stopped");
	}
}
public class InterfaceExample2 {
	public static void main(String[] args) {
		bike b = new bike();
		b.start();
		b.stop();
	}
}
