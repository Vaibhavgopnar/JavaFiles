package programs;

import java.util.Scanner;

public class P06_LeapYear {

	public static boolean isLeapYear(int year) {

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				} else
					return false;
			} else
				return true;
		} else
			return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year");
		int year = sc.nextInt();
		System.out.println(isLeapYear(year));
		sc.close();
	}
}
