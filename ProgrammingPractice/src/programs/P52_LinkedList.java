package programs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class P52_LinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Ronaldo");
		ll.add("Messi");
		ll.add("Neymar");
		ll.add("Mbappe");
		ll.add("Giggs");
		ll.add("Rooney");
		ll.add("Chetri");
		ll.add("Persie");
		ll.add("Zlatan");
		System.out.println(ll);
		System.out.println();
		 Iterator<String> itr = ll.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 System.out.println();
		 ListIterator<String> litr = ll.listIterator();
		 while(litr.hasNext()) {
			 System.out.println(litr.next());
		 }
		 
		 System.out.println("Count of Elements : "+ll.size());
		 
		 ll.remove(3);
		 ll.remove("Rooney");
		 System.out.println(ll);
		 
		 System.out.println("Class of List : "+ll.getClass());
	}
}
