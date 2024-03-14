package Day3;

public class CopyArrayintoAnother {

	public static void main(String[] args) {
		
		int arr1[] = {23,45,56,78,67};
		int arr2[] = new int[arr1.length];
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

}
