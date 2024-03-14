package programs;

public class P34_Pattern3 {

	public static void main(String[] args) {
		
		int n = 5;
		 for (int i = 1; i <= n; i++) 
	        {
	            int num = i;
	            for (int j = 1; j <= n; j++) 
	            {
	            	if(num <=9)
	                    System.out.print("0"+num+"  ");
	                	else
	            	System.out.print(num+"  ");
	                num = num+5;
	            }
	            System.out.println();
	        }
	}
	
}
