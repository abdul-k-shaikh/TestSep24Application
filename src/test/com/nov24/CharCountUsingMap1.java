package test.com.nov24;

import java.util.HashMap;
import java.util.Map;

public class CharCountUsingMap1 {

	public static void main(String[] args) {
		String str = "abdulAbdul";
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			mp.put(c, mp.containsKey(c) ? mp.get(c) + 1 : 1);
		}
		for (Map.Entry<Character, Integer> e : mp.entrySet()) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}
	}

}
