package Day1Practice;

public class SumofEvenOdd {

	public static void main(String[] args) {

		int num = 34567;

		int rem = 0 , evensum = 0, oddsum = 0;
		
		while(num != 0) {
			rem = num % 10;
			if(rem % 2 == 0) 
				evensum += rem;
			else
				oddsum += rem;
			num /= 10;
		}
		System.out.println("EvenSum : "+evensum);
		System.out.println("Odd Sum : "+oddsum);

	}

}
