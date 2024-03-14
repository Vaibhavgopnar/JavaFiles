package programs;

import java.util.ArrayList;
import java.util.Iterator;

public class P51_ArrayList {

	public static void main(String[] args) {
		//Task 1
		ArrayList<String> al = new ArrayList<String>();
		 al.add("Sachin"); 
		 al.add("Dravid");
		 al.add("Laxman");
		 al.add("Ganguly");
		 al.add("Dhoni");
		 al.add("Rohith");
		 al.add("Virat");
		 al.add("Yuvraj");
		 al.add("Bumrah");
		
		 System.out.println(al);
		 System.out.println();
		 
		 // Task 2
		 System.out.println("Print Using Iterator ");
		 Iterator<String> itr = al.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 
		 //Task 3 .1
		 System.out.println(al.isEmpty());
		 
		 // Task 3.2
		 ArrayList<String> al2 = new ArrayList<String>();
		 al2.add("Indian Cricketers -- >  ");
		 
		 System.out.println(al2.addAll(al));		 
		 System.out.println(al2);
		 
		 // Task 3.3
		 System.out.println(al.getClass());
		 
		 System.out.println("Using for each method");
		 al.forEach((s) -> System.out.println(s));
		 //Task 4
	}

}
