package programs;

import java.util.Scanner;

public class P38_PrimiriveDataType {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input ");

		try {
			long x = sc.nextLong();
			System.out.println(x + " can be stored in:");
			if (x >= -128 && x <= 127)
				System.out.println("byte");
			if (x >= -32768 && x <= 32767)
				System.out.println("short");
			if (x >= -2147483648 && x <= 2147483647)
				System.out.println("int");
			if (x >= (-(Math.pow(2, 63))) && x <= (Math.pow(2, 63) - 1))
				System.out.println("long");
			if(x <= 3.40282347*(Math.pow(10, 38)) && x>= 1.40239846*(Math.pow(10, -45)))
				System.out.println("float");
		} catch (Exception e) {
			System.out.println(sc.next() + " can't be stored anywhere.");
		}
		sc.close();
	}
}
