package programs;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class P55_TreeSet {

	public static void main(String[] args) {

		TreeSet<Integer> tr = new TreeSet<Integer>();

		tr.add(100);
		tr.add(50);
		tr.add(125);
		tr.add(175);
		tr.add(45);
		tr.add(225);
		tr.add(500);
		tr.add(25);
		tr.add(75);
		tr.add(15);
		tr.add(150);
		tr.add(5);

		System.out.println(tr);

		Iterator<Integer> iterator = tr.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();
		Iterator<Integer> desc = tr.descendingIterator();
		while (desc.hasNext()) {
			System.out.println(desc.next());
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any input to get greater elements");
		int n = sc.nextInt();
		int last = tr.last();
		System.out.println("Greater : "+tr.subSet(n, last+1));

		System.out.println("Smaller : "+tr.subSet(tr.first(), n));
		
		System.out.println(tr.getClass());
		System.out.println("Enter starting elements of range");
		int n1 = sc.nextInt();
		System.out.println("Enter last elements of range");
		int n2 = sc.nextInt();
		System.out.println(tr.subSet(n1, n2));
		
		sc.close();
	}
}
