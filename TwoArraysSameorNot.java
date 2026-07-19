package JavaOops;

import java.util.Scanner;

public class TwoArraysSameorNot {
	public static void main(String[] args) {
		Scanner nt = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int n = nt.nextInt();
		
		int a[] = new int[n],b[] = new int[n],i,j,count=0;
		for (i=0;i<n;i++) {
			System.out.printf("Number %d : ",i+1);
			a[i] = nt.nextInt();
		}
		for (j=0;j<n;j++) {
			System.out.printf("Number %d : ",j+1);
			b[j] = nt.nextInt();
		}
		for (i=0;i<n;i++) {
			for (j=0;j<n;j++) {
				if (a[i] == b[j]) {
					count++;
				}
			}
		}
		if (count == n) {
			System.out.println("The Two Arrays are Same");
		}
		else {
			System.out.println("The Two Arrays are not Same");
		}
	}
}
