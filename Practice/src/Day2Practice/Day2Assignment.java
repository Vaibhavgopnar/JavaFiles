package Day2Practice;

public class Day2Assignment {

	public static void main(String[] args) {
		
		int num = 6;
		int pow = 3;
		
		isPerfectSquaer(num);
		System.out.println();
		primeFactors(num);
		System.out.println();
		powerOfNumber(num,pow);
		System.out.println();
		factors(num);
		System.out.println();
		strongNumber(num);
		System.out.println();
		isAutomorphic(num);
		
	}

	private static void isAutomorphic(int num) {
	
		int square = num * num;
		int numlastdigit = 0;
		int squarelastdigit = 0;
		
		while(num > 0) {
			numlastdigit = num % 10;
			squarelastdigit = square % 10;
			
			if(numlastdigit != squarelastdigit) {
				System.out.println("Not an Automorphic Number");
			}
			else
				System.out.println("This number is an Automorphic Number");
			
			num /= 10;
			square /= 10;
		}
		
	}

	private static void strongNumber(int num) {
		
		int fact, rem;
		int temp = num;
		int sum = 0;
		
		while(temp != 0) {
		
			fact = 1;
			
			rem = temp % 10;
			for(int i = 1; i <= rem; i++)
				fact = fact * i;
			
			sum = sum + fact;
			
			temp = temp / 10;
		}
		
		if(sum == num)
			System.out.println("This is Strong Number");
		else
			System.out.println("Not a Strong Number");
		
	}

	private static void factors(int num) {
		
		System.out.println("Factors of Number are : ");
		for(int i = 1; i <= num; i++) {
			if(num % i == 0)
				System.out.println(i);
		}
		
	}

	private static void powerOfNumber(int num, int pow) {
		
		long res = 1;
		int p = pow;
		while(pow != 0) {
			res *= num;
			--pow;
		}
		System.out.println(num+"th power of "+p+"  is : "+res);
		
	}

	private static void primeFactors(int num) {
		
		System.out.println("Prime Factors are : ");
		for(int i = 2; i < num; i++) {
			while(num % i == 0) {
				System.out.println(i);
				num /= i;
			}
		}
		if(num > 2)
			System.out.println(num);
		
	}

	private static void isPerfectSquaer(int sq) {
		
		boolean flag = false;
		for(int i = 0; i <= sq/2; i++) {
			if(i * i == sq) {
				flag = true;
				break;
			}
			else
				flag = false;
		}
		if(flag == true)
			System.out.println("This number is Perfect Square");
		else
			System.out.println("This number is Not a Perfect Square");
		
	}

}
