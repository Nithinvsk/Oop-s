package JavaOops;

class Addition {
	int add(int a, int b) {
		return a+b;
	}
	int add(int a, int b, int c) {
		return a+b+c;
	}
}
public class OverloadingInPolymoriphismOfAddition {
	public static void main(String[] args) {
		Addition ad = new Addition();
		System.out.println(ad.add(2,3));
		System.out.println(ad.add(1,2,3));
	}
}
