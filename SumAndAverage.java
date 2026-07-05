package JavaOops;

import java.util.Scanner;

public class SumAndAverage {
	public static void main(String[] args) {
		System.out.print("Enter the 1st subject marks : ");
		Scanner nt = new Scanner(System.in);
		int marks1 = nt.nextInt();
		
		System.out.print("Enter the 2nd subject marks : ");
		int marks2 = nt.nextInt();
		
		System.out.print("Enter the 3rd subject marks : ");
		int marks3 = nt.nextInt();
		
		int sum = marks1 + marks2 + marks3;
		float avg = ((marks1 + marks2 + marks3)/3);
		
		System.out.println("The Sum of Three Subjects : "+sum);
		System.out.println("The Avg of Three Subjects : " +avg);
	}
}
