package JavaOops;

import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {
	System.out.print("Enter the Character : ");
	Scanner nt = new Scanner(System.in);
	char alpha = nt.next().charAt(0);
	if (alpha == 'A' || alpha == 'E' || alpha == 'I' || alpha == 'O' || alpha == 'U') {
		System.out.println("It is a vowel");
	}
	else if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u') {
		System.out.println("It is a vowel");
	}
	else {
		System.out.println("It is not a vowel");
	   }
	}
}
