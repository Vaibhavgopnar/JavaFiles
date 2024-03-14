package programs;

public class P21_ReverseStrWordbyWord {

	public static void main(String[] args) {

		String str = "Hi Good Evening All";
		String temp = "";
		String reverse = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				temp = str.charAt(i) + temp;
			} else {
				reverse = reverse + temp + " ";
				temp = "";
			}
		}
		reverse = reverse + temp;
		System.out.println(reverse);
		
//	int count = 0;
//	int arr_pos = 0;
//	
//	for(int i = 0; i<str.length(); i++) {
//		if(str.charAt(i) != ' ') {
//			count++;
//		}
//	}
//	
//	String arr[] = new String[count+1];
//	
//	for(int i = str.length()-1; i>=0; i--) {
//		if(str.charAt(i) != ' ') {
//			reverse = reverse + str.charAt(i);
//		}
//		else {
//			arr[arr_pos] = reverse;
//			arr_pos++;
//			reverse="";
//		}
//	}
//	arr[arr_pos] = reverse;
//	for(int i = arr.length-1; i>=0; i--) {
//		System.out.print(arr[i]);
//	}
	}
}
