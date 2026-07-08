package JavaOops;

import java.util.Scanner;

public class SymmetricOrNot2DArray {
	public static void main(String[] args) {
        Scanner nt = new Scanner(System.in);
		
		System.out.print("Enter the row : ");
		int row = nt.nextInt();
		
		System.out.print("Enter the Column : ");
		int column = nt.nextInt();
		
		int a[][] = new int[row][column],i,j,symmetric=1;
		for (i=0;i<row;i++) {
			for (j=0;j<column;j++) {
				System.out.printf("Row %d and Column %d : ",i+1,j+1);
				a[i][j] = nt.nextInt();
			}
		}
		for (i=0;i<row;i++) {
			for (j=0;j<column;j++) {
				System.out.print(a[j][i]);
				System.out.print(" ");
			}
			System.out.println();
		}
		for (i=0;i<row;i++) {
			for (j=0;j<column;j++) {
				if (a[i][j] != a[j][i]) {
					symmetric = 0;
					break;
				}
			}
		}
		if (symmetric == 1) {
			System.out.println("Symmetric Matrix");
		}
		else {
			System.out.println("Not a Symmetric Matrix");
		}
	}
}
