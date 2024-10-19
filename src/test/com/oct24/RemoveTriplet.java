package test.com.oct24;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveTriplet {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 3, 3, 4, 5, 6 };
		Map<Integer, Long> collect = Arrays.stream(a).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		int res[] = new int[a.length];
		int j = 0;
		for (Map.Entry<Integer, Long> data : collect.entrySet()) {
			if (data.getValue() >= 2) {
				res[j++] = data.getKey();
				res[j++] = data.getKey();
			} else {
				res[j++] = data.getKey();
			}
		}
		System.out.println(Arrays.toString(res));
	}

}
