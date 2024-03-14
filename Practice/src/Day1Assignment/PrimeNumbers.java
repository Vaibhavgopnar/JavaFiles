package Day1Assignment;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int num = 20;
		boolean flag = true;
		for(int i = 1; i < num; i++) {
			flag = true;
			for(int j = 2; j <= i/2 ; j++) {
				if(i% j == 0) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				System.out.println(i);
			}
		}

	}

}
