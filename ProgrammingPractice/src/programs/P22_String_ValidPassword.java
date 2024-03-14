package programs;

public class P22_String_ValidPassword {

	private static void isValidPassword(String str) {

//		if (!(str.length() > 7 && str.length() < 16))
//			return false;
//		if ((str.contains(" ")))
//			return false;
//		if (true) {
//			int count = 0;
//			for (int i = 0; i <= 9; i++) {
//				String str1 = Integer.toString(i);
//				if (str.contains(str1)) {
//					count = 1;
//				}
//			}
//			if (count == 0)
//				return false;
//
//			if (!(str.contains("@") || str.contains("#") || str.contains("$") || str.contains("%")
//					|| str.contains("&")))
//				return false;
//
//			for (int i = 65; i <= 90; i++) {
//				char c = (char) i;
//				String str1 = Character.toString(c);
//				if (str.contains(str1)) {
//					count = 1;
//				}
//			}
//			if (count == 0)
//				return false;
//
//			for (int i = 97; i <= 122; i++) {
//				char c = (char) i;
//				String str1 = Character.toString(c);
//				if (str.contains(str1)) {
//					count = 1;
//				}
//			}
//			if (count == 0)
//				return false;
//		}
		
		int con = 0;
		if ((str.length() > 7 && str.length() < 16)) 
		{
			for(int i = 0; i < str.length(); i++) {
				if ((str.contains(" "))) {
					System.out.println("Not a Valid Password");
				}
				else {
					if(str.charAt(i)>=48 && str.charAt(i) <=57) {
						con++;
					}
					if(str.charAt(i)>=97 && str.charAt(i) <=122) {
						con++;
					}
					if(str.charAt(i)>=65 && str.charAt(i) <=90) {
						con++;
					}
					if(str.charAt(i)>=35 && str.charAt(i) <=38) {
						con++;
					}
				}
			}
		}
		else {
			System.out.println("Invalid password");
		}
		if(con >= 4)
			System.out.println("Valid");
		else
			System.out.println("Invalid password");
	}

	public static void main(String[] args) {

		String str = "Alpha@345790998";

		isValidPassword(str);
//		System.out.println(str);
//		if (check)
//			System.out.println("Valid");
//		else
//			System.out.println("Not Valid");
	}

}
