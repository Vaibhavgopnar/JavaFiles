package Day3;

public class CountDigits {

	public static void main(String[] args) {
		
		long n = 35554656465546l;
		
		int count = 0;
		int rem = 0;
		
		while(n > 0) {
			rem = (int) (n % 10);
			count++;
			n /= 10;
		}

		System.out.println(count);
	}

}
