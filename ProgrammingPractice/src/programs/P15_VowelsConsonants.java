package programs;

import java.util.Scanner;

public class P15_VowelsConsonants {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String str = sc.nextLine();

		int vowel_count = 0;
		int consonant_count = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
					|| str.charAt(i) == 'U' || str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
					|| str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				vowel_count++;
			}
			else if(str.charAt(i) != ' ')
				consonant_count++;
		}

		System.out.println("Vowels are : "+vowel_count);
		System.out.println("Consonants are : "+consonant_count);
		sc.close();
	}

}
