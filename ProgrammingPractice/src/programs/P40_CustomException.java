package programs;

import java.util.Scanner;

class CustomeException extends Exception {

	private static final long serialVersionUID = 1L;

	public CustomeException(String str) {
		super(str);
	}
}

public class P40_CustomException {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age  ");
		int age = sc.nextInt();
		sc.close();
		if (age < 18) {
			throw new CustomeException("Age is less than 18. Rejected");
		}

		else if (age > 65) {
			throw new CustomeException("Age is more than 65. Rejected");
		} else
			System.out.println("Accepted");

	}
}
