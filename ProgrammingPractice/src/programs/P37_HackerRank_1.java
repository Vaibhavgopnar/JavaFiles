package programs;

import java.util.Scanner;

public class P37_HackerRank_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String school1 = "Delhi Public School";
		String school2 = "Cambridge Public School";

		System.out.println("How many schools are ?");
		int s = sc.nextInt();
		int c, st;
		String school[][][] = new String[s][][];

		for (int i = 0; i < s; i++) {
			if (i == 0)
				System.out.println("school name :- " + school1);
			else
				System.out.println("school name :- " + school2);
			System.out.println("How many classes are in this School");
			c = sc.nextInt();
			school[i] = new String[c][];
			for (int a = 0; a < c; a++) {
				System.out.println("inside class no: " + (a + 1));
				System.out.println("How many students are in class " + (a + 1));
				st = sc.nextInt();
				school[i] = new String[c][st];
				for (int j = 0; j < st; j++) {
					System.out.println("Student " + (j + 1) + "  Please Enter the feedback:");
					school[i][a][j] = sc.next();
				}
				System.out.println();
			}
			System.out.println("--------------------------------------------------");
		}
		System.out.println("---------------------------------------------------");

		for (int i = 0; i < s; i++) {
			if (i == 0)
				System.out.println("school name :- " + school1);
			else
				System.out.println("school name :- " + school2);
			for (int j = 0; j < school[i].length; j++) {
				for (int k = 0; k < school[i][j].length; k++) {
					System.out.print(school[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println("-----------------------------------------------");
		}
		sc.close();
	}
}
