package JavaOops;

import java.util.Scanner;

public class DiagonalOFMatrix2DArray {
	public static void main(String[] args) {
		Scanner nt = new Scanner(System.in);
		
		System.out.print("Enter the Row : ");
		int row = nt.nextInt();
		
		System.out.print("Enter the Column : ");
		int column = nt.nextInt();
		
		int a[][] = new int[row][column],i,j;
		for (i=0;i<row;i++) {
			for (j=0;j<column;j++) {
				System.out.printf("Row %d Column %d : ",i+1,j+1);
				a[i][j] = nt.nextInt();
			}
		}
		for (i=0;i<row;i++) {
			for (j=0;j<column;j++) {
				if (i==j) {
					System.out.println(a[i][j]);
				}
			}
		}
	}
}
