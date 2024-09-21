package test.com.sept;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LastNameCounter {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Abdul Shaikh", "Ajay Kumar", "Vimal Gupta", "Ajit Gupta", "Anand Raj");

		Map<String, Integer> mp = new HashMap<String, Integer>();
		for (String name : names) {
			String[] split = name.split(" ", 2);
			String lastName = split[1];
			mp.put(lastName, mp.containsKey(lastName) ? mp.get(lastName) + 1 : 1);
		}
		for (Map.Entry<String, Integer> ele : mp.entrySet()) {
			System.out.println(ele.getKey() + ":" + ele.getValue());
		}
	}

}
