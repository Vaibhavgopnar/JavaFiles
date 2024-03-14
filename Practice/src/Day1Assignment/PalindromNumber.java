package Day1Assignment;

public class PalindromNumber {

	public static void main(String[] args) {

		int n1 = 23433;
		int n2=0 ;
		int temp = n1;
		int rem=0;
		
		while(n1 != 0) {
			rem = n1 % 10;
			n2 = (n2 *10 )+ rem;
			n1 = n1 / 10;
		}
		
		if(temp == n2)
			System.out.println("Palindrom");
		else
			System.out.println("Not Palindrom");

	}

}
