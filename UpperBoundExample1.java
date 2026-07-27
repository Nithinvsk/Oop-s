package JavaOops;

class Calculato <T extends Number> {
	private T num;
	
	Calculato (T num ) {
		this.num = num;
	}
	
	void square() {
		System.out.println("Square : "+num.doubleValue() * num.doubleValue());
	}
}
public class UpperBoundExample1 {
	public static void main(String[] args) {
		Calculato <Integer> c1 = new Calculato <>(4);
		c1.square();
		
		Calculato <Double> c2 = new Calculato <>(5.0);
		c2.square();
		
	}
}
