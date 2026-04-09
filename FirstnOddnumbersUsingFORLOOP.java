package JavaOops;

import java.util.Scanner;

public class FirstnOddnumbersUsingFORLOOP {
	public static void main(String[] args) {
		System.out.print("Enter the Number : ");
		Scanner nt = new Scanner(System.in);
		int num = nt.nextInt();
		int i;
		for (i=1;i<=num;i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}
