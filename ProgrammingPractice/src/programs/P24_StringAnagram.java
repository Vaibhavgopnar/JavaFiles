package programs;

import java.util.Arrays;

public class P24_StringAnagram {

	public static void main(String[] args) {

		String s1 = "ABCDE R";
		String s2 = "CDB ARE";
		
		System.out.println(isAnagram(s1, s2));
	}

	private static boolean isAnagram(String s1, String s2) {
//		String s11 = "";
//		String s22 = "";
//		if(s1.length() == s2.length()) {
//			for(int i = 0; i<= s1.length(); i++) {
//				if(s1.charAt(i) == ' ') {
//				}
//				else {
//					s11 = s11 + s1.charAt(i);
//				}
//			}
//			for(int i = 0; i< s2.length(); i++) {
//				if(s2.charAt(i) == ' ') {
//				}
//				else {
//					s22 = s22 + s2.charAt(i);
//				}
//			}
//		}
		
		char[] str1 = s1.toCharArray();
		char[] str2 = s2.toCharArray();	
		Arrays.sort(str1);
		Arrays.sort(str2);
		if(Arrays.equals(str1,str2))
			return true;
		
		if(str1.length == str2.length)
		for(int i = 0; i < str1.length; i++) {
			if(str1[i] == str2[i])
				return true;
		}
		return false;
	}
}


