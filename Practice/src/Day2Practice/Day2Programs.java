package Day2Practice;

import java.util.Arrays;

public class Day2Programs {
	public static void main(String[] args) {

		int arr[] = { 23, 34, 45, 12, 89, 67, 45 };

		minMaxArr(arr);

		int factorial = fact(5);
		System.out.println(factorial);

		boolean arm = isArmstrong(370);
		System.out.println(arm);
		
		String s = "Vaibhav is a Smart Boy";
		
		upperCase(s);
		
		numberOfWords(s);
		
		String s1 = "BDFGTR";
		String s2 = "GFDTBR";
		
		isAnagram(s1, s2);
	}

	private static void isAnagram(String s1, String s2) {
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		int count = 0;
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(s1.length() == s2.length()) {
			
			for(int i = 0; i < s1.length(); i++) {
				if(c1[i] == c2[i]) {
					count++;
				}
			}
			if(count == s1.length()) 
				System.out.println("Anagram");
			else
				System.out.println("Not Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
		
	}

	private static void numberOfWords(String s) {
		
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ' && s.charAt(i+1) != ' ' ) {
				count++;
			}
		}
		System.out.println("Number of Words"+(++count));
		
	}

	private static void upperCase(String s) {
		
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				count++;
				System.out.println(s.charAt(i));
			}
		}
		System.out.println("UpperCase : "+count);
		
	}

	static void minMaxArr(int[] arr) {
		int min = 0, max = 0;

		if (arr[0] < arr[1]) {
			min = arr[0];
			max = arr[1];
		} else {
			min = arr[1];
			max = arr[0];
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= min) {
				min = arr[i];
			}
			if (arr[i] >= max) {
				max = arr[i];
			}
		}
		System.out.println("Min : " + min);
		System.out.println("Max : " + max);

		// Arrays.sort(arr);
		// System.out.println("Min : "+arr[0]);
		// System.out.println("Max : "+arr[arr.length-1]);
	}

	static int fact(int num) {
		if (num == 0)
			return 1;
		else
			return (num * (fact(num - 1)));
	}

	static boolean isArmstrong(int num) {
		int temp = num;
		int rem = 0;
		int pow = 0;
		double res = 0;

		while (num > 0) {
			num = num / 10;
			pow++;
		}

		num = temp;
		while (temp > 0) {
			rem = temp % 10;
			res = res + Math.pow(rem, pow);
			temp = temp / 10;
		}

		if (num == res)
			return true;
		else
			return false;
	}
}