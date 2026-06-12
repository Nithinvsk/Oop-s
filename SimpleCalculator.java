package JavaOops;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
	System.out.print("Enter the 1st number : ");
	Scanner nt = new Scanner(System.in);
	int num1 = nt.nextInt();
	
	System.out.print("Enter the 2nd number : ");
	int num2 = nt.nextInt();
	
	System.out.print("Enter the Operator : ");
	char ope = nt.next().charAt(0);
	
	int result;
	
	switch(ope) {
	case '+' :
		result = num1+num2;
		System.out.println("Result : "+result);
		break;
	case '*' :
		result = num1*num2;
		System.out.println("Result : "+result);
		break;
	case '-' :
		if (num1 >= num2) {
			result = num1 - num2;
			System.out.println("Result : "+result);
		}
		else {
			result = num2 - num1;
			System.out.println("Result : "+result);
		}
		break;
	case '/' :
		if (num1 >= num2) {
			result = num1 / num2;
			System.out.println("Result : "+result);
		}
		else {
			result = num2 / num1;
			System.out.println("Result : "+result);
		}
		break;
	   }
	}
}
