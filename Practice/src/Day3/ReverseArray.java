package Day3;

public class ReverseArray {

	public static void main(String[] args) {
		
		int arr[] = {34,56,78,90,32,54,67,98};
		
		for(int i = arr.length-1; i >= 0;i--) {
			System.out.print(arr[i]+", ");
		}

	}

}
