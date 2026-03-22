package JavaOops;

import java.util.Scanner;

public class Divisionin2DArray {
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
		
			
		int a[][] = new int[rows1][columns1],b[][] = new int[rows2][columns2],i,j;
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
			for (j=0;j<columns1;j++) {
				if (b[i][j] != 0) {
					System.out.print(a[i][j] / b[i][j]);
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
