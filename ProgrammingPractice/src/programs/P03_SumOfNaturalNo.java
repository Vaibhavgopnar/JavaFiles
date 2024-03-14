package programs;

public class P03_SumOfNaturalNo {

	static int sumUsingLoop(int n) {
		
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}		
		return sum;
	}
	
	static int sumUsingRecursion(int n) {
		
		if(n == 0)
			return 0;
		else
			return (n + sumUsingRecursion(n-1));
	}
	
	static int sumUsingAP(int n, int a) {

		// Using formula
//		if(n == 0)
//			return 0;
//		else 
//			return n * (n+1) / 2;
		
		// Using loop
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum = sum + a;
			a = a + 1;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		System.out.println(sumUsingLoop(10));
		System.out.println(sumUsingRecursion(10));
		System.out.println(sumUsingAP(10, 1));
		
	}
}
