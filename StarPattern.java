package JavaOops;

import java.util.Scanner;

public class StarPattern {
	public static void main(String[] args) {
		System.out.print("Enter the Number : ");
		Scanner nt = new Scanner(System.in);
		int num = nt.nextInt();
		
		int i,j;
		for (i=num;i>0;i--) {
			for (j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}
 