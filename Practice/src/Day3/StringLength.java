package Day3;

public class StringLength {

	public static void main(String[] args) {
		
		String s = "gegegttyuoisdfnyu";

		int len = lengthStr(s);
		System.out.println(len);
	}

	private static int lengthStr(String s) {
		
		if(s.equals(" "))
			return 0;
		else
			return  lengthStr(s.substring(1))    + 1; 
		
	}

}
