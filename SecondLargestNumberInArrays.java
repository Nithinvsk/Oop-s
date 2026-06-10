package JavaOops;

import java.util.Scanner;

public class SecondLargestNumberInArrays {
	public static void main(String[] args) {
		Scanner nt = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int n = nt.nextInt();
		
		int a[] = new int[n],i;
		for (i=0;i<n;i++) {
			System.out.printf("Number %d : ",i+1);
			a[i] = nt.nextInt();
		}
		int first_large = a[0],second_large = 0;
		for (i=1;i<n;i++) {
			if (a[i] > first_large) {
				second_large = first_large;
				first_large = a[i];
			}
			else if (a[i] > second_large && a[i] != first_large) {
				second_large = a[i];
			}
		}
		System.out.println("The First Largest Number in the Array is "+first_large);
		System.out.println("The Second Largest Number in the Array is "+second_large);
	}
}
