package JavaOops;

import java.util.Scanner;

public class SumofMatrix2DArrays {
	public static void main(String[] args) {
		Scanner nt = new Scanner(System.in);
		
		System.out.print("Enter the Rows : ");
		int row = nt.nextInt();
		
		System.out.print("Enter the Rows : ");
		int column = nt.nextInt();
		
		int a[][] = new int[row][column],i,j,sum=0;
		for (i=0;i<row;i++) {
			for (j=0;j<column;j++) {
				System.out.printf("Number %d : ",i+1);
				a[i][j] = nt.nextInt();
				sum += a[i][j];
			}
		}
		System.out.println("The Sum Of the matrix is "+sum);
	}
}
