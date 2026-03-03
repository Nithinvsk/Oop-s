package JavaOops;

import java.util.Scanner;

public class BooleanInScanner {
	public static void main(String[] args) {
		System.out.println("Enter a Number : ");
		Scanner nt = new Scanner(System.in);
		boolean B = nt.hasNextInt();
		System.out.println(B);
	}
}
