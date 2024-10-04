package test.com.oct24;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExamples {

	public static void main(String[] args) {
		// 1. find the sum of given list
		List<Integer> list = Arrays.asList(1, 2, 3, 5);
		Optional<Integer> sum = list.stream().reduce((a, b) -> a + b);
		System.out.println("sum of integer: " + sum.get());

		// 2.impl of reduce mtd to get the longest string
		List<String> words = Arrays.asList("GFG", "Geeks", "for", "GeeksQuiz", "GeeksforGeeks");
		Optional<String> longestString = words.stream().reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2);
		System.out.println(longestString.get());

		// 3.AvgOfNumbers
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		double avg = nums.stream().mapToInt(e -> e).average().getAsDouble();
		System.out.println("avg of nos :" + avg);

		// find the square of nos and find avg of nos which is >than 100
		List<Integer> nums1 = Arrays.asList(1, 10, 20, 30, 15);
		double avgGreaterThan100 = nums1.stream().map(e -> e * e).filter(e -> e > 100).mapToInt(e -> e).average()
				.getAsDouble();
		System.out.println("avgGreaterThan100 :" + avgGreaterThan100);

		// even odd nos
		List<Integer> nums2 = Arrays.asList(11, 10, 20, 30, 15, 0);
		List<Integer> evenNos = nums2.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println("even nos :" + evenNos);

		List<Integer> oddNos = nums2.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
		System.out.println("even nos :" + oddNos);

		// Print Numbers Starts With Prefix 2
		List<Integer> nums3 = Arrays.asList(11, 10, 20, 30, 15, 0);
		List<Integer> startsWith2 = nums.stream().map(e -> String.valueOf(e)).filter(e -> e.startsWith("2"))
				.map(Integer::valueOf).collect(Collectors.toList());
		System.out.println("startsWith2 :" + startsWith2);

		// Duplicate numbers
		List<Integer> nums4 = Arrays.asList(1, 2, 2, 3, 4, 5, 6, 6, 7, 8, 8, 10);
		Set<Integer> dup = nums4.stream().filter(n -> Collections.frequency(nums4, n) > 1).collect(Collectors.toSet());
		System.out.println(dup);
		// 2nd way
		Set<Integer> dupNum = new HashSet<Integer>();
		Set<Integer> dupliCateNum = nums4.stream().filter(n -> !dupNum.add(n)).collect(Collectors.toSet());
		System.out.println("Duplicates using set: " + dupliCateNum);

	}

}
