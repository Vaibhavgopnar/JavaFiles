package Day1Practice;

public class Palindrom {

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
		
		
		// For String
		
		String s = "SAS";
		String res = "";
		
		for(int i = s.length()-1; i >=0; i--) {
			
			res = res + s.charAt(i);
		}
		
		if(s.equals(res)== true)
			System.out.println("Palindrom");
		else
			System.out.println("Not Palindrom");
		
		
		
		
		
	}
}
