package Day1Assignment;

public class SumOfFibonacci {

	public static void main(String[] args) {
		
		int n = 10;
		
		int a = 0, b = 1, c = 0;
		
		for(int i = 0; i <= n; i++) {
			c = a + b;
			a = b; 
			b = c;
			System.out.println(c);
		}
		System.out.println("Sum : "+c);

	}

}
