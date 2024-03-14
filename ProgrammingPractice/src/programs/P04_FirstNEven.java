package programs;

public class P04_FirstNEven {

	static void firstNEven(int n) {

		int even[] = new int[n];
		int no = 0;
		for (int i = 0; i < (n * 2); i++) {
			if (i % 2 == 0 && (n ^ 1) == n + 1) {
				even[no++] = i;
			}
		}
		for (int i : even) {
			System.out.print(i + " ");
		}

//		for(int i = 0; i < n; i++) {
//			even[i] = i * 2;
//			System.out.print(even[i]+" ");
//		}

	}

	public static void main(String[] args) {
		firstNEven(20);
	}
}
