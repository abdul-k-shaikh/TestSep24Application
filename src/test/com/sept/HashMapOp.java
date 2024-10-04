package test.com.sept;

import java.util.HashMap;
import java.util.Map;

public class HashMapOp {

	public static void main(String[] args) {
		Map<Character, Integer> mp = new HashMap<Character, Integer>();

		String str = "need to create a portfolio using react.js";
		str = str.replaceAll(" ", "");
		System.out.println(str);
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			mp.put(ch, mp.containsKey(ch) ? mp.get(ch) + 1 : 1);
		}

		for (Map.Entry<Character, Integer> ele1 : mp.entrySet()) {
			System.out.println(ele1.getKey() + ":" + ele1.getValue());
		}
	}

}
