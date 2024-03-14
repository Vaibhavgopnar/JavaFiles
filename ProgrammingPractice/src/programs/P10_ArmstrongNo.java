package programs;

import java.util.Scanner;

public class P10_ArmstrongNo {

	public static void armstrongCheck(int n) {
		int rem = 0, power = 0;
		double sum = 0 ;
		int temp = n;
		
		while(temp > 0) {
			temp = temp/10;
			power++;
		}
		temp = n;
		while(n > 0) {
			rem = n % 10;
			sum = sum + (Math.pow(rem, power));
			n = n/ 10;
		}
		if(temp == sum)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not a Armstrong Number");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		int n = sc.nextInt();
		
		armstrongCheck(n);
		sc.close();
	}
}
