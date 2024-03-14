package programs;

import java.util.Scanner;

public class P11_SumOfNFibonacci {

	public static void sumOfFabonacci(int n) {

		int a = 0, b = 1, c = 0, sum = 1;
		System.out.print(a + ", " + b + ", ");
		for (int i = 2; i < n; i++) {
			c = a + b;
			System.out.print(c + ", ");
			sum = sum + c;
			a = b;
			b = c;
		}
		System.out.println("\nSum = " + sum);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range Number ");
		int n = sc.nextInt();
		System.out.print("The Series is : ");
		sumOfFabonacci(n);
		sc.close();
	}

}
