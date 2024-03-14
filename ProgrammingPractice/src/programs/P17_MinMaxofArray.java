package programs;

public class P17_MinMaxofArray {

	private static void minMaxofArray(int arr[]) {
		int min, max;
		min = arr[0];
		max = arr[0];
//		if (arr[0] > arr[1]) {
//			max = arr[0];
//			min = arr[1];
//		} else {
//			max = arr[1];
//			min = arr[0];
//		}
		
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}

	public static void main(String[] args) {

		int arr[] = { 52, 6, 12, 10, 18, 23, 8 };

		minMaxofArray(arr);
	}

}
