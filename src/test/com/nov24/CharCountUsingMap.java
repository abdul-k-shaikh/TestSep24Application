package test.com.nov24;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharCountUsingMap {

	public static void main(String[] args) {
		String s = "aaayyycccvvvbbaa";
		Map<Character, Integer> mp = new LinkedHashMap<Character, Integer>();

		char c;
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			mp.put(c, mp.containsKey(c) ? mp.get(c) + 1 : 1);
		}
		for (Map.Entry<Character, Integer> ele : mp.entrySet()) {
			System.out.print(ele.getKey() + ":" + ele.getValue() + " ");
		}
	}
	// hashMap o/p: a:5 b:2 c:3 v:3 y:3
	// Treemap o/p: a:5 b:2 c:3 v:3 y:3
	//LinkedHashMap : a:5 y:3 c:3 v:3 b:2 
	//LinkedHashMap:

}
