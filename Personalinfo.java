package JavaOops;

import java.util.Scanner;

public class Personalinfo {
	public static void main(String[] args) {
	System.out.print("Enter the Name : ");
	Scanner nt = new Scanner(System.in);
	String name = nt.nextLine();
	
	System.out.print("Enter the Age : ");
	String age = nt.nextLine();
	
	System.out.print("Enter the City : ");
	String city = nt.nextLine();
	
	System.out.println("Name : "+name);
	System.out.println("Age : "+age);
	System.out.println("City : "+city);
	}
}
