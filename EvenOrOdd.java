package JavaOops;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		System.out.print("Enter the number : ");
		Scanner nt = new Scanner(System.in);
		int num = nt.nextInt();
		if (num % 2 == 0) {
			System.out.print("It is a Even Number");
		}
		else {
			System.out.print("It is a Odd Number");
		}
	}
}
