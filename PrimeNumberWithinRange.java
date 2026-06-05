package JavaOops;

import java.util.Scanner;

public class PrimeNumberWithinRange {
	public static void main(String[] args) {
		System.out.print("Enter the Number : ");
		Scanner nt = new Scanner(System.in);
		int num = nt.nextInt();
		int i,j,count=0;
		for (i=1;i<=num;i++) {
			count = 0;
			for (j=1;j<=i;j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i);
			}
		}
	}
}
