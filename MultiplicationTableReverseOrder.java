package JavaOops;

import java.util.Scanner;

public class MultiplicationTableReverseOrder {
	public static void main(String[] args) {
	System.out.print("Enter the Number : ");
	Scanner nt = new Scanner(System.in);
	int num = nt.nextInt();
	
	int i,product;
	for (i=10;i>0;i--) {
		product = num * i;
		System.out.printf("%d x %d = %d\n",num,i,product);
	  }
   }
}
