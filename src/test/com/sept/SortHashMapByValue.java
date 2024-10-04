package test.com.sept;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapByValue {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Math", 98);
		map.put("Data Structure", 85);
		map.put("Database", 91);
		map.put("Java", 95);
		map.put("Operating System", 79);
		map.put("Networking", 80);

		LinkedHashMap<String, Integer> sortedMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new

				));
		sortedMap.forEach((key, value) -> System.out.println("key= " + key + ",Value=" + value));

	}

}
