package JavaOops;

public class TypecastingNarrowing {
	public static void main(String[] args) {
		double d = 9.78;
		int num = (int) d;
		System.out.println("Before Typecasting : "+d);
		System.out.println("After Typecasting : "+num);
		
		double loss = d-num;
		System.out.println("Data Lossing After Typecasting : "+loss);
	}
}
