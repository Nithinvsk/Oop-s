package JavaOops;

import java.util.Scanner;

public class MultiplicationSum {
	public static void main(String[] args) {
		System.out.print("Enter the Number : ");
		Scanner nt = new Scanner(System.in);
		int num = nt.nextInt();
		
		int i,sum=0;
		for (i=1;i<=10;i++) {
			sum = sum + num*i;
		}
		System.out.println("The Sum is : "+sum);
	}
}
