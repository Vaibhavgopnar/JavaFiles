package programs;

public class P02_Factorial {
	    
	    static int factorial(int n){
	        
	        // Using recursion
	        if(n == 0)
	        return 1;
	        else
	        return (n* factorial(n-1));
	        
	        // without recirsion
	        // int fact = 1;
	        // for(int i = 1; i<= n; i++){
	        //     fact *= i;
	        // }
	        // return fact;
	    }
	    
	    public static void main(String[] args) {
	       System.out.println(factorial(10));
	    }
	}
