package programs;

import java.util.Iterator;
import java.util.PriorityQueue;

public class P54_PriorityQueue {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		 
		pq.add(100);
		pq.add(50);
		pq.add(125);
		pq.add(175);
		pq.add(45);
		pq.add(225);
		pq.add(500);
		pq.add(25);
		pq.add(75);
		pq.add(15);
		pq.add(150);
		pq.add(5);
		
		System.out.println(pq);
		
		Iterator<Integer> iterator = pq.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Highest Priority - "+pq.peek());	
		System.out.println("Highest Priority Element Removed-  "+pq.poll());
		
		System.out.println(pq);
		
		System.out.println(pq.getClass());
	}
}
