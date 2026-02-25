package JavaOops;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
	System.out.print("Enter the Number : ");
	Scanner nt = new Scanner(System.in);
	int num = nt.nextInt();
	int i=0,sum=0,x,y,z;
	x = num;
	while (x > 0) {
		i++;
		x = x / 10;
	   }
	y = num;
	while (y > 0) {
		z = y % 10;
		sum += Math.pow(z, i);
		y = y / 10;
     	}
	if (sum == num) {
		System.out.println("It is a Armstrong Number");
	}
	else {
		System.out.println("It is not a Armstrong Number");
	}
  }
}
