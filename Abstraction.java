package JavaOops;

abstract class Vehicle {
	abstract void start();
	void stop() {
		System.out.println("Car Vehicle Stopped");
	}
}
class Car extends Vehicle {
	void start() {
		System.out.println("Car Vehicle Started");
	}
}
class Bus {
	void start() {
		System.out.println("Bus Vehicle Started");
	}
}
public class Abstraction {
	public static void main(String[] args) {
		Car c = new Car();
		Bus b = new Bus();
		c.start();
		c.stop();
		b.start();
	}
}
