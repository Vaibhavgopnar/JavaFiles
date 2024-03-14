package programs;

public class P19_CountUppercase {

	private static int countUppercase(String str) {
		
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >=65 && str.charAt(i) <= 90) {
				count++;
			}
		}		
		return count;
	}
	
	public static void main(String[] args) {

		String str = "JaVa Is thE BeSt LANguaGe ";
		
		System.out.println(countUppercase(str));
	}

}
