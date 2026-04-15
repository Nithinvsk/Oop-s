package JavaOops;

class Boxx <T> {
	private T value;
	
	void setValue(T value) {
		this.value = value;
	}
	
	T getValue() {
		return value;
	}
	
	void showType() {
		System.out.println("Type of T : "+value.getClass().getName());
	}
}
public class GenericClassExample1 {
	public static void main(String[] args) {
		Boxx <Integer> b = new Boxx<>();
		b.setValue(26);
		b.showType();
		System.out.println("Value : "+b.getValue());
		
		Boxx <String> B = new Boxx<>();
		B.setValue("Nithin");
		B.showType();
		System.out.println("Value : "+B.getValue());
	}
}
