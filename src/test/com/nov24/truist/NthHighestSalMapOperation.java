package test.com.nov24.truist;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class NthHighestSalMapOperation {

	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("anil", 1000);
		map1.put("bhavan", 1300);
		map1.put("mical", 1500);
		map1.put("tom", 1600);
		map1.put("ankit", 1200);
		map1.put("daniel", 1700);
		map1.put("james", 1400);

		Entry<String, Integer> entry = map1.entrySet().stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList()).get(1);
		System.out.println(entry);

	}

}
