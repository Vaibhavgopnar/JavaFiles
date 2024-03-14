package practice;

import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string ");
		String st =sc.nextLine();
		int count = 0;
		
		for(int i = 0; i < st.length() -1; i++) {
			if(st.charAt(i) == ' ' && st.charAt(i+1) != ' ') {
				count++;
			}
		}
		System.out.println(count+1);
		sc.close();
	}

}
