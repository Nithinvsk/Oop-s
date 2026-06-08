package JavaOops;

import java.util.Scanner;

public class ReverseOfnNaturalNumbers {
	public static void main(String[] args) {
		System.out.print("Enter the Number : ");
		Scanner nt = new Scanner(System.in);
		int num = nt.nextInt();
		int i;
		for (i=num;i>0;i--) {
			System.out.println(i);
		}
	}
}
