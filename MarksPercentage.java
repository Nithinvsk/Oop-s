package JavaOops;

import java.util.Scanner;

public class MarksPercentage {
	public static void main(String[] args) {
		System.out.print("Enter the 1st subject Marks : ");
		Scanner nt = new Scanner(System.in);
		int Sub1 = nt.nextInt();
		
		System.out.print("Enter the 2nd subject Marks : ");
		int Sub2 = nt.nextInt();
		
		System.out.print("Enter the 3rd subject Marks : ");
		int Sub3 = nt.nextInt();
		
		System.out.print("Enter the 4th subject Marks : ");
		int Sub4 = nt.nextInt();
		
		System.out.print("Enter the 5th subject Marks : ");
		int Sub5= nt.nextInt();
		
		float percentage = ((Sub1+Sub2+Sub3+Sub4+Sub5) * 100) / 500;
		
		System.out.println("The Percentage is : "+percentage);
	}
}
