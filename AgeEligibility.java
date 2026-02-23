package JavaOops;

import java.util.Scanner;

public class AgeEligibility {
	public static void main(String[] args) {
		System.out.print("Enter the Age : ");
		Scanner nt = new Scanner(System.in);
		int age = nt.nextInt();
		if (age >= 18) {
			System.out.println("Eligible");
		}
		else {
			System.out.println("Not Eligible");
		}
	}
}
