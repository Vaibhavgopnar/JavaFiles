package Day3;

public class LowestCommonFactor {

	public static void main(String[] args) {

		int n1 = 90; 
		int n2 = 30;
		
		int lcm = 0;
		
		for(int i = n1; i > 1; i--) {
			if(n1 % i == 0 && n2 % i == 0) {
				System.out.println(i);
				lcm = i;
			}
		}
		System.out.println();
		System.out.println(lcm);
	}

}
