package practice;
class Test2 implements Cloneable {
	int a;
	int b;
//	Test c = new Test();
	
	public Object Clone() throws CloneNotSupportedException {
		return a;
		
	}
}

public class Main11 {

	public static void main(String[] args) {
		
		Test2 t1 = new Test2();
		t1.a = 10;
		t1.b = 20;
//		t1.c.x = 30;

	}

}
