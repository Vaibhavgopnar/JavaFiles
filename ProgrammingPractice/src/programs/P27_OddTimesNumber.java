package programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P27_OddTimesNumber {

	public static void main(String[] args) {

		Integer arr[] = { 1, 2, 3, 2, 5, 3, 1, 3, 2, 4, 5, 1, 4 };

		oddTimesNumber(arr);
	}

	private static void oddTimesNumber(Integer[] arr) {

		/*
		 * Create the array Find its length Call the oddOccu() by passing array and its
		 * length as parameter Inside the function create a nested with the value of
		 * count initialised to zero inside first loop Check if the element in arr[I] ==
		 * arr[j], if equal the increment count. Once the internal loop is completed
		 * check if the count has odd value if yes the print it else proceed.
		 */
		Map<Integer, Integer> map = new HashMap<>();

		List<Integer> list = Arrays.asList(arr);
		for (int i = 0; i < list.size(); i++) {
			map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() % 2 == 1) {
				System.out.print(entry.getKey() + ", ");
			}
		}
	}

}
