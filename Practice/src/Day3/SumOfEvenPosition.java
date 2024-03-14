package Day3;

public class SumOfEvenPosition {

	public static void main(String[] args) {
		
		int[] arr = {23, 45, 67, 89, 23, 13, 56, 45};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				sum = sum + arr[i];
				System.out.println(i + "   "+arr[i]);
			}
		}
		System.out.println(sum);
	}

}
