package JavaOops;

import java.util.Scanner;

public class BreakandContinue {
	public static void main(String[] args) {
		System.out.print("Enter the Number : ");
		Scanner nt = new Scanner(System.in);
		int num = nt.nextInt();
		int i;
		for (i=0;i<num;i++) {
			System.out.println(i);
			System.out.println("Nithin");
			if (i == 2) {
				System.out.println("Breaked!!!");
				break;
			}
		}
	}
}
