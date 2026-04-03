package JavaOops;

import java.util.Scanner;

public class FibinosicciNumbers {
	public static void main(String[] args) {
		int a = 0,b=1,c,i;
		System.out.print("Enter the Number : ");
		Scanner nt = new Scanner(System.in);
		int num = nt.nextInt();
		System.out.println(a);
		System.out.println(b);
		for (i=3;i<=num;i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}
}
