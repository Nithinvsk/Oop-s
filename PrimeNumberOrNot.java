package JavaOops;

import java.util.Scanner;

public class PrimeNumberOrNot {
	public static void main(String[] args) {
		System.out.print("Enter the Number : ");
		Scanner nt = new Scanner(System.in);
		int num = nt.nextInt();
		int i,count=0;
		for (i=1;i<=num;i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("It is a Prime Number");
		}
		else {
			System.out.println("It is not a Prime Number");
		}
	}
}
