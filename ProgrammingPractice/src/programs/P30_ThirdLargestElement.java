package programs;

import java.util.Arrays;

public class P30_ThirdLargestElement {

	public static void main(String[] args) {
		
		int arr[] = {1, 14, 2, 16, 10, 20};
		thirdLargestElement(arr);
	}

	private static void thirdLargestElement(int[] arr) {
		
		int i = 0, thirdelement = 0;
		Arrays.sort(arr);
		
		for( i = arr.length-1; i>=0; i-- ) {
			System.out.print(arr[i]+ ", ");	
		if(arr[i] == arr[arr.length-3])
			thirdelement = arr[i];
		}
		System.out.println();
		System.out.println(thirdelement);
	}

}
