package Day1Practice;

public class FibonicciSeries {

	public static void main(String[] args) {
		
		int num = 10;
		int a = 0, b = 1, c;
		
		System.out.println(a);
		System.out.println(b);
		for(int i = 0; i < num; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
		
		int i = recursiveFab(num);
		System.out.println(i);

	}

	private static int recursiveFab(int num) {

		if(num == 0 || num == 1)
			return  num;
		else
			return ( recursiveFab(num-1) +  recursiveFab(num-2)  );
		
	}

}
