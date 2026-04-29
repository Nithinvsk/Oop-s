package JavaOops;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner nt = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int num = nt.nextInt();
		
		int a[] = new int[num],i,found;
		for (i=0;i<num;i++) {
			System.out.printf("Number %d : ",i+1);
			a[i] = nt.nextInt();
		}
		System.out.print("Enter the Key to be Search : ");
		int key = nt.nextInt();
		for (i=0;i<num;i++) {
			if (a[i] == key) {
				System.out.printf("Element is Found at %d Position",i+1);
				break;
			}
		}
		if (i == num) {
			System.out.println("Element is not Found");
		}
	}
}
