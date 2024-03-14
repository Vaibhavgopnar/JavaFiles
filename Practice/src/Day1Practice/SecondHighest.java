package Day1Practice;

public class SecondHighest {

	public static void main(String[] args) {

		int arr[] = { 212, 34, 44, 66, 5, 7, 56, 76};
		int temp = 0;		
		
		for(int i = 0; i< arr.length-1; i++) {
			
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] =temp;
				}
			}
		}
		System.out.println("Second Largest number is : "+arr[arr.length-1]);
		for(int i = 0 ; i < arr.length; i++)
			System.out.print(" "+arr[i]);

	}

}
