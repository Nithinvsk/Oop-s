package JavaOops;

class Box <T> {
	private T value;
	
	Box(T value) {
		this.value = value;
	}
	
	void setValue(T value) {
		this.value = value;
	}
	
	T getValue() {
		return value;
	}
	
	void showType() {
		System.out.println("Type of T is : "+value.getClass().getName());
	}
}
public class GenericClassExample {
	public static void main(String[] ags) {
		Box<Integer> b = new Box<>(8);
		b.showType();
		System.out.println("Value : "+b.getValue());
		
		Box<String> B = new Box<>("Nithin");
		B.showType();
		System.out.println("Value : "+B.getValue());
	}
}