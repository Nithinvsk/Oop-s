package JavaOops;

import java.util.Scanner;

public class ReverseOfArray {
	public static void main(String[] args) {
		Scanner nt = new Scanner(System.in);
		
		System.out.print("Enter the n : ");
		int n = nt.nextInt();
		
		int a[] = new int [n],i;
		for (i=0;i<n;i++) {
			System.out.printf("Number %d : ",i+1);
			a[i] = nt.nextInt();
		}
		System.out.println("The Reverse of Array");
		for (i=n-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}
}
