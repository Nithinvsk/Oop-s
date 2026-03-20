package JavaOops;

import java.util.Scanner;

public class DeletioninArrays {
	public static void main(String[] args) {
		Scanner nt = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int n = nt.nextInt();
		
		int a[] = new int[n],i;
		for (i=0;i<n;i++) {
			System.out.printf("Number %d : ",i+1);
			a[i] = nt.nextInt();
		}
		
		System.out.print("Enter the Position to be Deleted : ");
		int pos = nt.nextInt();
		
		for (i=pos-1;i<n-1;i++) {
			a[i] = a[i+1];
		}
		for (i=0;i<n-1;i++) {
			System.out.println(a[i]);
		}
	}
}
