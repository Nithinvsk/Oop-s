package JavaOops;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		System.out.print("Enter the length : ");
		Scanner nt = new Scanner(System.in);
		float length = nt.nextFloat();
		
		System.out.print("Enter the breadth : ");
		float breadth = nt.nextFloat();
		
		float area = length*breadth;
		
		System.out.println("The Area of Rectangle is : "+area);
	}
}
