package Day3;

public class Replace0To1 {

	public static void main(String[] args) {
		
		int n =  234009404;
		
		int temp =0;
		int n1 = 0;
		int rem = 0;
		
		System.out.println(n);
		while(n > 0) {
			rem = n % 10;
			if(rem == 0) {
				rem = 1;
			}
			temp =  temp * 10+ rem ;
			n = n / 10;
		}
		rem = 0;
		while(temp > 0) {
			rem = temp % 10;
			n1 =  n1 * 10+ rem ;
			temp = temp / 10;
		}
	
		System.out.println(n1);

	}

}
