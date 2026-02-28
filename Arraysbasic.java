package JavaOops;

import java.util.Scanner;

public class Arraysbasic {
	public static void main(String[] args) {
		Scanner nt = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int num = nt.nextInt();
		
		int a[] = new int[num],i;
		for (i=0;i<num;i++) {
			System.out.printf("Number %d Student : ",i+1);
			a[i] = nt.nextInt();
		}
		System.out.println("The Student Marks are : ");
		for (i=0;i<num;i++) {
			System.out.println(a[i]);
		}
	}
}
