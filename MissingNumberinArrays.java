package JavaOops;

import java.util.Scanner;

public class MissingNumberinArrays {
	public static void main(String[] args) {
		Scanner nt = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int n = nt.nextInt();
		
		int a[] = new int[n],i,sum,array_sum=0;
		for (i=0;i<n-1;i++) {
			System.out.printf("Number %d : ",i+1);
			a[i] = nt.nextInt();
		}
		
		sum = n * (n + 1) / 2;
		
		for (i=0;i<n-1;i++) {
			array_sum += a[i];
		}
		
		int missing = sum - array_sum;
		System.out.println("The Missing Number is "+missing);
	}
}
