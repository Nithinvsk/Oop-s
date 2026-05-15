package JavaOops;

import java.util.Scanner;

public class Multiplicationin2DArrays {
	public static void main(String[] args) {
		Scanner nt = new Scanner(System.in);
		
		System.out.print("Enter the 1st Matrix Rows : ");
		int rows1 = nt.nextInt();
		
		System.out.print("Enter the 1st Matrix Columns : ");
		int columns1 = nt.nextInt();
		
		System.out.print("Enter the 2nd Matrix Rows : ");
		int rows2 = nt.nextInt();
		
		System.out.print("Enter the 2nd Matrix Columns : ");
		int columns2 = nt.nextInt();
		
		if (columns1 == rows2) {
			
		int a[][] = new int[rows1][columns1],b[][] = new int[rows2][columns2],i,j,k,sum=0;
		System.out.println("The 1st matrix ");
		for (i=0;i<rows1;i++) {
			for (j=0;j<columns1;j++) {
				System.out.printf("Row %d Column %d : ",i+1,j+1);
				a[i][j] = nt.nextInt();
			}
		}
		
		System.out.println("The 2nd matrix ");
		for (i=0;i<rows2;i++) {
			for (j=0;j<columns2;j++) {
				System.out.printf("Row %d Column %d : ",i+1,j+1);
				b[i][j] = nt.nextInt();
			}
		}
		
		for (i=0;i<rows1;i++) {
			for (j=0;j<columns2;j++) {
				sum=0;
				for (k=0;k<rows2;k++) {
					sum = sum + a[i][k]*b[k][j];
				}
				System.out.print(sum);
				System.out.print(" ");
			   }
			System.out.println(" ");
		    }
		
		}
		
		else {
			System.out.println("Multiplication is not possible");
		}
		
	}
}
