package programs;

public class P35_Pattern4 {

	public static void main(String[] args) {

		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = i + 1; j <= n+1; j++) {
				System.out.print("# ");
			}
			for (int j = 1 ; j <= n; j++) {
				System.out.print("$ ");
			}
			for (int k = 1; k <= (i * 2) - 1; k++)
			{
				System.out.print(i+" ");
			}
			for (int j = i ; j <= n; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}

}
