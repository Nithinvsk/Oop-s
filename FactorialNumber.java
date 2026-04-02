package JavaOops;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		System.out.print("Enter the Number : ");
		Scanner nt = new Scanner(System.in);
		int num = nt.nextInt();
		int i,fact=1;
		for (i=num;i>0;i--) {
			fact = fact * i;
		}
		System.out.println("The Factorial of Given Number is : "+fact);
	}
}