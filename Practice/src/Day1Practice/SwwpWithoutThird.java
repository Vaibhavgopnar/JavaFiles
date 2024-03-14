package Day1Practice;

public class SwwpWithoutThird {

	public static void main(String[] args) {


		int n1 = 34;
		int n2 = 43;
		
		n1 = n1^n2; // n1 + n2
		n2 = n1^n2; // n1 - n2
		n1 = n1^n2; // n1 - n2
		
		System.out.println("Now First is : "+n1);
		System.out.println("Now Second is :"+n2);

	}

}
