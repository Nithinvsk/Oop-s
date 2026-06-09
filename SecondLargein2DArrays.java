package JavaOops;

import java.util.Scanner;

public class SecondLargein2DArrays {
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
		int first_large = a[0][0];
		int second_large = 0;
		for (i=0;i<row;i++) {
			for (j=0;j<column;j++) {
				if (a[i][j] > first_large) {
					second_large = first_large;
					first_large = a[i][j];
				}
				else if (a[i][j] > second_large && a[i][j] != first_large) {
					second_large = a[i][j];
				}
			}
		}
		System.out.println("The Second Large is "+second_large);
	}
}
