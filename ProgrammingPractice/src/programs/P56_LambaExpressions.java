package programs;

import java.util.Scanner;

@FunctionalInterface
interface Calculator1 {
	void add(int a, int b, int c);
}

public class P56_LambaExpressions {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first element ");
		int n1 = sc.nextInt();
		System.out.println("Enter second element ");
		int n2 = sc.nextInt();
		System.out.println("Enter third element ");
		int n3 = sc.nextInt();
		
		Calculator1 c = (a1,a2,a3)-> {
			int res = a1+a2+a3;
			System.out.println(res);
		};
		
		c.add(n1, n2, n3);
		sc.close();
	}

}
