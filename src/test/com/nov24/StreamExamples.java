package test.com.nov24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {

	public static void main(String[] args) {
		// 1. common elements bw 2 arrays
		int array1[] = { 1, 2, 3, 4, 5 };
		int array2[] = { 4, 5, 6, 7, 8 };
		List<Integer> commonElements = Arrays.stream(array1)
				.filter(number -> Arrays.stream(array2).anyMatch(array2Num -> array2Num == number)).boxed()
				.collect(Collectors.toList());
		System.out.println("commonElements :" + commonElements);

	}

}
