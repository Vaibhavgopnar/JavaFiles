package programs;

import java.util.ArrayDeque;
import java.util.Iterator;

public class P53_ArrayDeque {

	public static void main(String[] args) {

		ArrayDeque<String> ad = new ArrayDeque<String>();
		ad.add("Rajkumar");
		ad.add("Amitab");
		ad.add("Rajnikanth");
		ad.add("Sharukh");
		ad.add("Puneeth");
		ad.add("Vijay");
		ad.add("Surya");
		ad.add("Chiranjeevi");
		ad.add("Salman");

		System.out.println(ad);
		
		Iterator<String> iterator = ad.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		ad.addFirst("Vishnu");
		ad.addFirst("Ambreesh");
		ad.addFirst("Shivaji");
		System.out.println(ad);
		
		ArrayDeque<String> ad2 = new ArrayDeque<String>();
		ad2.addAll(ad);
		System.out.println("ArrayDeque to ArrayDeque-2");
		System.out.println(ad2);
		
		System.out.println(ad.getClass());
	}
}
