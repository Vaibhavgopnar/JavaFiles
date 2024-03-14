package programs;

public class P26_missingElement {

	public static void main(String[] args) {

		int arr[] = { 2, 4, 6, 8, 12 };

		int missEle = missingElement(arr);
		System.out.println(missEle);
	}

	/*
	 * Find the type of sequence Find the total length Find the sum of elements
	 * based on the length Find the sum of elements in the given array Subtract the
	 * sum of elements in array by sum of elements based on the length PS: Depending
	 * on the sequence type the step 4 and 3 will change
	 * 
	 */
	private static int missingElement(int[] arr) {
		int n = arr.length + 1;  

	//	int sum = (n * (n + 1)) / 2;  // natural numbers
	//	int sum1 = n*n; // odd numbers
		int sum2 = n * (n+1);	// Even sum
		for (int i = 0; i < arr.length; i++) {
			sum2 = sum2 - arr[i];
	//		sum1 = sum1 - arr[i];
	//		 sum = sum - arr[i];
		}
		return sum2;
	}

}
