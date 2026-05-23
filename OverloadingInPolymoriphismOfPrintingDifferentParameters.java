package JavaOops;

class Print {
	void printing(int a) {
		System.out.println("Number : "+a);
	}
	void printing(String name) {
		System.out.println("Name is "+name);
	}
	void printing(String name, int age) {
		System.out.printf("Name is %s and age is %d",name,age);
	}
}
public class OverloadingInPolymoriphismOfPrintingDifferentParameters {
	public static void main(String[] args) {
		Print p = new Print();
		p.printing(8);
		p.printing("Nithin");
		p.printing("Nithin", 19);
	}
}
