package programs;

import java.util.Scanner;

public class P39_2DArrays {

	public static void main(String[] args) {

		// First Approach
		String clas[][] = { { "class1", "Ram", "Sham" }, { "class2", "Ram", "Sham", "Bheem" },
				{ "class3", "Ram", "Sham", "Hanuman", "Bheem" } };

		for (int i = 0; i < clas.length; i++) {
			for (int j = 0; j < clas[i].length; j++) {
				System.out.println(clas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		// Second Approach
		System.out.println("Second Approach");
		int st = 1;
		String s[][] = new String[3][4];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("How many students are in class " + (i + 1));
			st = sc.nextInt();
			for (int j = 0; j < st; j++) {
				System.out.println("Enter " + (j + 1) + " th student name");
				s[i][j] = sc.next();
			}
			System.out.println();
		}
		sc.close();

		for (int i = 0; i < s.length; i++) {
			System.out.println("class " + (i + 1));
			for (int j = 0; j < s[i].length; j++) {
				if (s[i][j] != null)
					System.out.println(s[i][j] + " ");
				else
					System.out.println("");
			}
			System.out.println();
		}

	}
}
