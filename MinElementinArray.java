package JavaOops;

import java.util.Scanner;

public class MinElementinArray {
	public static void main(String[] args) {
		Scanner nt = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int n = nt.nextInt();
		
		int a[] = new int[n],i;
		for (i=0;i<n;i++) {
			System.out.printf("Number %d : ",i+1);
			a[i] = nt.nextInt();
		}
		int min = a[0];
		for (i=1;i<n;i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Maximum Number in the Array is "+min);
	}
}
