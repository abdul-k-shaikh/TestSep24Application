package test.com.nov24.truist;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

	public static void main(String[] args) {
		String str = "abdulKamar";
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
