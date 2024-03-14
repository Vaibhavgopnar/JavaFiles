package programs;

public class P29_SwapPairsofString {

	public static void main(String[] args) {

		String str = "Java";	
		swapPairs(str);
	}

	private static void swapPairs(String str) {
		
		String s = "";
		char temp ;
		for(int i = 0; i < str.length(); i+=2) {
			char t = str.charAt(i), x = str.charAt(i+1);
			temp = t;
			t = x;
			x = temp;
			s = s+t +x;
		}
		System.out.println(s);
	}

}
