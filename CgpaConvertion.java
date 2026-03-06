package JavaOops;

import java.util.Scanner;

public class CgpaConvertion {
	public static void main(String[] args) {
		System.out.print("Enter the 1st Subject Marks : ");
		Scanner nt = new Scanner(System.in);
		int sub1 = nt.nextInt();
		
		System.out.print("Enter the 2nd Subject Marks : ");
		int sub2 = nt.nextInt();
		
		System.out.print("Enter the 3rd Subject Marks : ");
		int sub3 = nt.nextInt();
		
		System.out.print("Enter the 4th Subject Marks : ");
		int sub4 = nt.nextInt();
		
		System.out.print("Enter the 5th Subject Marks : ");
		int sub5 = nt.nextInt();
		
		float cgpa = ((sub1+sub2+sub3+sub4+sub5) / 50f);
		
		System.out.println("The CGPA is : "+cgpa);
	}
}
