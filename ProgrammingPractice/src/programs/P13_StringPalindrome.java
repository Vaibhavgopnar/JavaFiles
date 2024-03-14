package programs;

import java.util.Scanner;

public class P13_StringPalindrome {

	public static void isPalindrom(String str) {

		// First Approach
		int end = str.length() - 1;
		int start = 0;
		char[] ch = str.toCharArray();

		while (start < end) {
			char c = ch[start];
			ch[start] = ch[end];
			ch[end] = c;

			start++;
			end--;
		}
		String s = "";
		for (int i = 0; i < ch.length; i++) {
			s = s + ch[i];
		}
		if (s.equalsIgnoreCase(str))
			System.out.println("Palindrom");
		else
			System.out.println("Not a Palindrom");

		// Second Approach
		String s2 = "";
		for (int i = 0; i < str.length(); i++) {
			s2 = str.charAt(i) + s2;
		}
		if (s2.equalsIgnoreCase(str))
			System.out.println("Palindrom");
		else
			System.out.println("Not a Palindrom");
		
		// Third approach
		String s3 = "";
		for(int i = str.length()-1; i>=0; i--) {
			s3 = s3 + str.charAt(i);
		}
		if(str.equals(s3) == true) {
			System.out.println("Palindrom");
		}
		else
			System.out.println("Not a Palindrom");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();
		isPalindrom(str);
		sc.close();
	}

}
