package JavaOops;

class Calculator {
	int add(int a, int b) {
		return a+b;
	}
	int add(int a, int b, int c) {
		return a+b+c;
	}
}
public class PolymorphismOverloadingExample1 {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println("ADD of two numbers : "+cal.add(2,3));
		System.out.println("ADD of three numbers : "+cal.add(1,2,3));
	}
}
