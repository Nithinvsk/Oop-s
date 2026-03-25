package JavaOops;

import java.util.Scanner;

public class DuplicateNumber {
	public static void main(String[] args) {
		Scanner nt = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int n = nt.nextInt();
		
		int a[] = new int[n],i,j;
		for (i=0;i<n;i++) {
			System.out.printf("Number %d : ",i+1);
			a[i] = nt.nextInt();
		}
		for (i=0;i<n;i++) {
			for (j=i+1;j<n;j++) {
				if (a[i] == a[j]) {
					System.out.println("The Duplicate Number is "+a[i]);
					break;
				}
			}
		}
		if (i == n) {
			System.out.println("Duplicate Number Not Found");
		}
	}
}
