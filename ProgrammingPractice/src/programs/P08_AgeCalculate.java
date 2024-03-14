package programs;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class P08_AgeCalculate {

	public static void ageCalculator(String dob) {
		LocalDate birthd = LocalDate.parse(dob);
		LocalDate now = LocalDate.now();
		
		System.out.println(Period.between(birthd, now).getYears());
		System.out.println(Period.between(birthd, now).getMonths());
		System.out.println(Period.between(birthd, now).getDays());
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date in YYYY-MM-DD format ");
		String dob = sc.nextLine();
		ageCalculator(dob);
		sc.close();
	}

}
