package programs;

public class P33_Pattern2 {

	public static void main(String[] args) {

		int n = 10;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(j % 2 ==0) 
					System.out.print(0);
					else
						System.out.print(1);
			}
			System.out.println();
		}
	}

}
