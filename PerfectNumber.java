package JavaOops;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
	System.out.print("Enter the Number : ");
	Scanner nt = new Scanner(System.in);
	int num = nt.nextInt();
	int i,sum=0;
	for (i=1;i<num;i++) {
		if (i % 2 == 0) {
			sum = sum + i;
		}
	}
	if (sum == num) {
		System.out.println("It is a Perfect Number");
	}
	else {
		System.out.println("It is not a Perfect Number");
	   }
	}
}
