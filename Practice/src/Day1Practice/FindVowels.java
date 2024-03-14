package Day1Practice;

public class FindVowels {

	public static void main(String[] args) {

		String s = "Skill lync learning platform";
		s = s.toLowerCase();

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				System.out.println("Vowels are : "+s.charAt(i));
			}
		}

	}

}
