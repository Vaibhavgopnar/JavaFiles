package Day3;

public class HighestCommonFactor {

	public static void main(String[] args) {

		int n1 = 20;
		int n2 = 150;
		
		int hcf = 0;		

		for (int i = 1; i <= n1 && i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				System.out.println(i);
				hcf = i;
			}
		}
		System.out.println(hcf);

	}
}
