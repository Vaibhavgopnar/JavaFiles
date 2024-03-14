package programs;

public class P16_sumEvenArray {

	public static int sumofEvenArray(int[] arr){
		int n = arr.length;
		int sum = 0;
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				sum = sum + arr[i];
				System.out.print(arr[i]+"  ");
			}
		}
		System.out.println("\n");
		return sum;
	}
	public static void main(String[] args) {
		int[] arr = {15, 16, 12, 10, 18, 8};
		System.out.println("Sum = "+sumofEvenArray(arr));
	}

}
