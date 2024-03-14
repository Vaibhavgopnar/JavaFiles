package Day1Practice;

import java.util.Scanner;

public class TrianglePattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= 5; i++) {

			for (int j = i + 1; j <= 5; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= (i * 2) - 1; k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
