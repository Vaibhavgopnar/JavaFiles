package programs;

import java.time.LocalTime;

public class P59_CurrentDateTime {

	public static void main(String[] args) {

		LocalTime t1 = LocalTime.now();
		System.out.println(t1.getHour());
		System.out.println(t1.getHour() * 60 + t1.getMinute());
		System.out.println(t1.toSecondOfDay());
	}

}
