package programs;

public class P20_ProductInString {

	private static int productInString(String str) {
		int product = 1;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				product = product * (str.charAt(i) - 48);
		//		product = product * Character.getNumericValue(str.charAt(i));
			}
		}
		return product;
	}

	public static void main(String[] args) {

		String str = "4PREP2INSTAA6HFRE7sfd";
		System.out.println(productInString(str));
	}

}
