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
		
		
		
	}

}
