package JavaOops;

public class TypecastingNarrowing2 {
	public static void main(String[] args) {
		long num = 1300000000;
		int b = (int) num;
		System.out.println("Before Typecasting : "+num);
		System.out.println("After Typecasting : "+b);
		
		long loss = num-b;
		System.out.println("Data lossing After Typecasting : "+loss);
	}
}
