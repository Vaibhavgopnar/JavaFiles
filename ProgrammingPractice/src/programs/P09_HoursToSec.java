package programs;

import java.util.Scanner;

public class P09_HoursToSec {

	public static int hrConvertToSec(int hrs) {
		
		int minutes, seconds;
		minutes = hrs * 60;
		seconds = minutes * 60;
		
		return seconds;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Hourse ");
		int hrs = sc.nextInt();
		System.out.println(hrConvertToSec(hrs));
		sc.close();
	}

}
