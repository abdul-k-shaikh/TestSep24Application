package test.com.sept;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccurringChar {

	public static void main(String[] args) {
		String str = "GOD BLESS SPIDERMAN";
		Map<Character, Integer> mp = new HashMap<>();

		char c;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			mp.put(c, mp.containsKey(mp) ? mp.get(c) + 1 : 1);
		}

		char maxKey = ' ';
		int maxVal = 0;

		for (Map.Entry<Character, Integer> ele : mp.entrySet()) {
			if (ele.getValue() > maxVal) {
				maxVal = ele.getValue();
				maxKey = ele.getKey();
			}

		}
		System.out.println();
		System.out.print(maxKey+" ");
		System.out.println(maxVal);
	}

}
