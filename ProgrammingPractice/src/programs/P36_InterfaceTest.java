package programs;

interface Calculator {
	void input();
	void add();
	void sub();
	void mul();
}
public class P36_InterfaceTest {

	public static void main(String[] args) {
		// Anonymous Type
		Calculator c = new Calculator() {
			int input;
			int input2;
			@Override
			public void input() {
				input = 20; 
				input2 = 10;
				System.out.println(input+"  "+input2);
				
			}

			@Override
			public void add() {			
				System.out.println("Addition is : "+(input + input2));
			}

			@Override
			public void sub() {
				System.out.println("Substraction is : "+(input - input2));
			}

			@Override
			public void mul() {
				System.out.println("Multiplication is : "+(input * input2));
			}		
		};
		
		c.input();
		c.add();
		c.sub();
		c.mul();
	}

}
