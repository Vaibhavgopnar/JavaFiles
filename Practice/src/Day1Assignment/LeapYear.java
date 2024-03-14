package Day1Assignment;

public class LeapYear {

	public static void main(String[] args) {

		int year = 2025;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("Leap Year");
				} else
					System.out.println("Not Leap Year");
			} else
				System.out.println("Leap Year");
		} else
			System.out.println("Not Leap Year");

	}

}
