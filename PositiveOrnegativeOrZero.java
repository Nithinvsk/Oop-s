package JavaOops;

import java.util.Scanner;

public class PositiveOrnegativeOrZero {
	public static void main(String[] args) {
		System.out.print("Enter the Number : ");
		Scanner nt = new Scanner(System.in);
		int num = nt.nextInt();
		if (num > 0) {
			System.out.print("It is Positive Number");
		}
		else if (num < 0) {
			System.out.print("It is Negative Number");
		}
		else {
			System.out.print("It is Zero Number");
		}
	}
}
