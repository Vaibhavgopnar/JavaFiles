package Day3;

public class SumofMatrix {

	public static void main(String[] args) {
		
		int[][] a1 = {{12,34,56,78}, {43,32,87,54}};
		
		int [][] a2 = {{ 23,34,45,23}, {67,78,12,34}};

		int[][] sum = new int[2][4];
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 4; j++) {
				sum[i][j] = a1[i][j] + a2[i][j];
			}
		}
		
		for(int[] r : sum) {
			for(int c : r) {
				System.out.println(c);
			}
			System.out.println();
		}
		
		
	}

}
