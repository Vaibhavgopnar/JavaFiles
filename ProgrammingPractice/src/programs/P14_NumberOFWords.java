package programs;

import java.util.Scanner;

public class P14_NumberOFWords {

	public static void countWords(String str) {
		int count = 0;
		str = str.trim();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ' && str.charAt(i+1) != ' ' &&i>0) {
				count++;
			}
		}
		 count++;
		System.out.println(count);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.nextLine();

		countWords(str);
		sc.close();
	}
}
