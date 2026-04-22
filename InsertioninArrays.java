package JavaOops;

import java.util.Scanner;

public class InsertioninArrays {
	public static void main(String[] args) {
		Scanner nt = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int n = nt.nextInt();
		
		int a[] = new int[n+1],i;
		for (i=0;i<n;i++) {
			System.out.printf("Number %d : ",i+1);
			a[i] = nt.nextInt();
		}
		
		System.out.print("Enter the Position to be insert : ");
		int pos = nt.nextInt();
		

		System.out.print("Enter the Insert Number : ");
		int num = nt.nextInt();
		
		for (i=n;i>=pos;i--) {
			a[i] = a[i-1];
		}
		a[pos-1] = num;
		n++;
		
		for (int m : a) {
			System.out.println(m);
		}
	}
}
