package Day1Assignment;

public class ConvertStringToInt {

	public static void main(String[] args) {
		
		String s = "egegrf";
		int s1 = 0;
		
		char ch[] = s.toCharArray();
		
		for(int i = 0; i < s.length(); i++) {
			
			s1 = s1 * 10 +  ((int) s.charAt(i) - 48);
		}
		System.out.println(s1);
		
	}

}
