package Day3;

import java.util.Scanner;

public class TrimString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String ");
		String str = sc.nextLine();

//		String str = "       vefgfge ffere fgreqtr       ";
		String s1 = "";
		String s3 = "";
		
		for (int i = 0; i < str.length(); i++) {
			if ((i + 1) != str.length()) {
				if (str.charAt(i) == ' ' && str.charAt(i + 1) == ' ') {

				} else {
					s1 = s1 + str.charAt(i);
				}
			}
		}
		if (s1.charAt(0) == ' ' || s1.charAt(s1.length() - 1) == ' ') {
			for (int i = 1; i <= s1.length() - 1; i++) {
				s3 = s3 + s1.charAt(i);
			}
		}
		System.out.print(s3);

	}

}
