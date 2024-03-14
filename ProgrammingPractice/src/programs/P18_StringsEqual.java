package programs;

import java.util.Scanner;

public class P18_StringsEqual {

	private static void isEqual(String s1, String s2) {

		// Using equals()
		System.out.print("Result Using equals() : - ");
		if (s1.equals(s2))
			System.out.println("Strings are Equal");
		else
			System.out.println("Strings are not Equal");

		// using equalsIgnoreCase()
		System.out.print("Result Using equalsIgnoreCase() : - ");
		if (s1.equalsIgnoreCase(s2))
			System.out.println("Strings are Equal");
		else
			System.out.println("Strings are not Equal");

		// using compareTo()
		System.out.print("Result Using compareTo() : -");
		if (s1.compareTo(s2) == 0)
			System.out.println("Strings are Equal");
		else
			System.out.println("Strings are not Equal");

		// without using the above 3
		System.out.print("Result Without Using built-in Function : - ");
		boolean flag = false;
		if (s1.length() == s2.length())
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) == s2.charAt(i)) {
					flag = true;
				}
			}
		if (flag)
			System.out.println("Strings are Equal");
		else
			System.out.println("Strings are not Equal");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String s1 = sc.next();
		System.out.println("Enter second String");
		String s2 = sc.next();

		isEqual(s1, s2);
		sc.close();
	}

}
