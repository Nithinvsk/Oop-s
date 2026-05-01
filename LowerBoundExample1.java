package JavaOops;

import java.util.*;

public class LowerBoundExample1 {
	static void addnum(List<? super Integer> nt) {
		nt.add(8);
		nt.add(26);
		nt.add(14);
		nt.add(25);
		
	}
	public static void main(String[] args) {
		List <Integer> n1 =  new ArrayList<>();
		addnum(n1);
		
		List <Number> n2 = new ArrayList<>();
		addnum(n2);
		
		List <Object> n3 = new ArrayList<>();
		addnum(n3);
		
		System.out.println("Integer List : "+n1);
		System.out.println("Number List : "+n2);
		System.out.println("Object List : "+n3);	
	}
}
