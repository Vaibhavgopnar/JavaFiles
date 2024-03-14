package programs;

import java.util.ArrayList;

public class P57_For_eachLoop {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(100);
		al.add(50);
		al.add(125);
		al.add(175);
		al.add(45);
		al.add(225);
		al.add(500);
		al.add(25);
		al.add(75);
		al.add(15);
		al.add(150);
		al.add(5);
		
		for(int al2 : al) {
			System.out.println(al2);
		}
	}

}
