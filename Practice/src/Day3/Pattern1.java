package Day3;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of lines ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			for (int j =0; j <= i; j++) {
				System.out.print("&");
			}
			
			System.out.println();
		}

		for (int i = 1; i <= n; i++) {

			for (int j = i + 1; j <= n + 1; j++) {
				System.out.print("# ");
			}

			System.out.println();
		}

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				System.out.print("$ ");
			}
			System.out.println();
		}

	}

}
