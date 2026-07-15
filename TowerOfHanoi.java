package JavaOops;

import java.util.*;
public class TowerOfHanoi {
	static int count = 0;
	static void toh(int n, char source, char aux, char destination) {
		if (n ==1) {
			System.out.println("Move disk 1 from " + source + " to " + destination);
			count++;
			return;
		}
		
		toh(n-1,source,destination,aux);
		count++;
		System.out.println("Move disk " + n + " from " + source + " to " + destination);
		
		toh(n-1,aux,source,destination);	
	}
	public static void main(String args[]) {
		Scanner nt = new Scanner(System.in);
		System.out.println("Enter the Number of disks : ");
		int n = nt.nextInt();
		toh(n,'A','B','C');
		System.out.println("Total Count "+count);
	}
}
