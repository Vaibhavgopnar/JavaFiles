package programs;

import java.util.Scanner;

public class P07_SwapNumbers {

	public static void swapNumbers(int n1, int n2) {
//		n1 = n1 + n2;
//		n2 = n1 - n2;
//		n1 = n1 - n2;
		n1 = n1^n2;
		n2 = n1^n2;
		n1 = n1^n2;
		System.out.println("After Swaping");
		System.out.println("n1 = "+n1);
		System.out.println("n2 = "+n2);
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number ");
		int n1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int n2 = sc.nextInt();
		swapNumbers(n1, n2);
		sc.close();
	}

}
