package JavaOops;

class Ok <T extends Comparable<T>> {
	private T value;
	
	Ok (T value) {
		this.value = value;
	}
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
public class UpperBoundExample2 {
	public static void main(String[] args) {
		Ok <String> str = new Ok <>("Nithin");
		str.showType();
		System.out.println("Value : "+str.getValue());
		
		Ok <Integer> n = new Ok <> (8);
		n.showType();
		System.out.println("Value : "+n.getValue());
	}
}
