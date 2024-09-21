package test.com.sept;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveTriplet {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 3, 3, 4, 5, 6 };
		Map<Integer, Long> countElements = Arrays.stream(a).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("countElements :"+ countElements );
		int res[] = new int[a.length];
		int j = 0;
		for (Map.Entry<Integer, Long> ele : countElements.entrySet()) {
			if (ele.getValue() >= 2) {
				res[j++] = ele.getKey();
				res[j++] = ele.getKey();
			} else {
				res[j++] = ele.getKey();
			}
		}
		System.out.println(Arrays.toString(res));

	}

}
