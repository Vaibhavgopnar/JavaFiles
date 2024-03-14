package programs;

public class P28_SumOfDiagonals {

	public static void main(String[] args) {

		int arr[][] = { 
				{ 4,	  5, 	6,   7 }, 
				{ 1,	  7,    3,   4 },
				{ 11, 12, 13,  14 },
				{ 23, 24, 25,  50 } };
 
		sumOfDiagonals(arr);
	}

	private static void sumOfDiagonals(int[][] arr) {
		
		int pSum = 0;
		int sSum = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j <=i; j++) {
				pSum = pSum + arr[i][j];
				sSum = sSum + arr[i][arr.length - (i+1)];
			}
		}
		System.out.println("Sum of principal diagonal elements: "+pSum);
		System.out.println("Sum of secondary diagonal elements: "+sSum);
	}	
}
