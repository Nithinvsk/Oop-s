package JavaOops;

import java.util.Scanner;

public class ForEachLoop {
	public static void main(String[] args) {
		Scanner nt = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int n = nt.nextInt();
		
		int a[] = new int[n],i;
		for (i=0;i<n;i++) {
			System.out.printf("Number %d : ",i+1);
			a[i] = nt.nextInt();
		}
		for (int element : a) {
			System.out.println("The Array is : "+element);
		}
	}
}
