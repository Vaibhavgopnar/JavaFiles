package programs;

public class P01_isPrime {

	static Boolean isPrime(int n) {
		
		if (n <= 2)
			return true;

		boolean flag = true;
		
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag =  false;
			}
		}
		return flag;
	}

	static public void main(String[] args) {
		
		if(isPrime(4))
			System.out.println(true);
		else
			System.out.println(false);
	}
}
