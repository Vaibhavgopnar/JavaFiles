package programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P31_FrequencyOfElement {

	public static void main(String[] args) {
		
		Integer arr[] = {10, 30, 10, 20, 10, 20, 30, 10};
		List<Integer> list = Arrays.asList(arr);
		frequencyOfElements(list);
	}

	private static void frequencyOfElements(List<Integer> list) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i< list.size(); i++) {
			map.put(list.get(i), map.getOrDefault(list.get(i), 0) +1);
		}
		
		 for (Map.Entry<Integer, Integer> entry : map.entrySet())
	        {
	            System.out.println(entry.getKey()+" Occurs " + " " + entry.getValue()+" times");
	        }
		 System.out.println();
		
//		 return list;
	}
	
}
