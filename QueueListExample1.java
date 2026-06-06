package JavaOops;

import java.util.*;

public class QueueListExample1 {
	public static void main(String[] args) {
		Queue <Integer> num = new LinkedList <>();
		
		num.offer(8);
		num.offer(26);
		num.offer(14);
		num.offer(25);
		num.offer(8);  // Duplicates are allowed.
		
		System.out.println("Queue List : "+num);
		
		int n = num.poll();
		System.out.println("Removed Element : "+n);
		System.out.println("Queue List After Removing : "+num);
		
		System.out.println("Peek Element : "+num.peek());
	}
}
