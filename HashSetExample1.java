package JavaOops;

import java.util.*;

public class HashSetExample1 {
	public static void main(String[] args) {
		HashSet<Integer> num = new HashSet <>();
		
		num.add(8);
		num.add(26);
		num.add(14);
		num.add(25);
		num.add(null);
		num.add(8); //Duplicates not allowed.
		
		System.out.println("Numbers List : " +num);
		
		num.remove(null);
		System.out.println("Numbers List : " +num);
		
		System.out.println("Contains Number 8 ? : " +num.contains(8));
		System.out.println("List Size : " +num.size());
		
		Iterator nt = num.iterator();
		while (nt.hasNext()) {
			System.out.println("Numbers are : " +nt.next());
		}
		
	}
}
