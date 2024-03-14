package programs;

public class P05_AutomorphicNo {

	static boolean isAutomorphic(int n) {
		
		int square = n * n;
		int nlastdigit = 0;
		int sqlastdigit = 0;
		
		 while(n>0) {
			 nlastdigit = n %10;
			 sqlastdigit = square % 10;
			 if(nlastdigit != sqlastdigit)
				 return false;
			 
			 n = n/ 10;
			 square /=10; 
		 }		
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println(isAutomorphic(6));
	}
}
