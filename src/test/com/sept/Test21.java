package test.com.sept;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test21 {

	public static void main(String[] args) {
		List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
		List<Integer> UniqElements = numbersWithDuplicates.stream().distinct().collect(Collectors.toList());
		System.out.println("UniqElements" + UniqElements);

		Map<Integer, Long> elementsCounts = numbersWithDuplicates.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("elementsCounts" + elementsCounts);

	}

}
