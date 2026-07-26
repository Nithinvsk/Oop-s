package JavaOops;

import java.util.*;

public class UpperBoundedExample3 {
	static void display(List<? extends Number> nt) {
		for (Number num : nt) {
			System.out.println(num);
		}
	}
	public static void main(String[] args) {
		List <Integer> n1 =  Arrays.asList(1,2,3);
		display(n1);
		
		List <Double> n2 = Arrays.asList(2.5,3.5,6.7);
		display(n2);
		
		System.out.println("Integer List : "+n1);
		System.out.println("Double List : "+n2);
	} 
}
