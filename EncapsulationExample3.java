package JavaOops;

import java.util.Scanner;

class Area {
	private int length;
	private int breadth;
	Area(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	void getArea() {
		int area = length * breadth;
		System.out.println("Area is "+area);
	}
}
public class EncapsulationExample3 {
	public static void main(String[] args) {
		Scanner nt = new Scanner(System.in);
		
		System.out.println("Enter the Length : ");
		int len = nt.nextInt();
		
		System.out.println("Enter the Breadth : ");
		int bre = nt.nextInt();
		
		Area a = new Area(len,bre);
		a.getArea();
	}
}
