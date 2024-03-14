package Day1Practice;

public class DuplicateChar {

	public static void main(String[] args) {

		String s = "Skill Lync Course";
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			for (int j = i + 1; j < s.length(); j++) {

				if (s.charAt(j) == c) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
