package programs;

public class P23_RemoveStringSpaces {

	public static void main(String[] args) {

		String str = "    Hi Good Evening    ";
		removeLeadingTrailingSpaces(str);
	}

	private static void removeLeadingTrailingSpaces(String str) {

		// Approach 1
		System.out.println("String Using trim() ");
		String s = str.trim();
		System.out.print(s);
		System.out.println(" - " + s.length());
		System.out.println("----------------");

		// Approach 2
		System.out.println("String without Using trim() ");
		String s2 = str.strip();
		System.out.print(s2);
		System.out.println(" - " + s2.length());
		System.out.println("----------------");

		// Approach 3
		System.out.println("String without Using built in functions ");
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
		System.out.println(" - "+s3.length());
	}
}
