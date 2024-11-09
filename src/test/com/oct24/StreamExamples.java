package test.com.oct24;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
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
		List<Integer> nums3 = Arrays.asList(11, 10, 20, 30, 15, 0, 55, 5, 51);
		List<Integer> startsWith2 = nums3.stream().map(e -> String.valueOf(e)).filter(e -> e.startsWith("2"))
				.map(Integer::valueOf).collect(Collectors.toList());
		System.out.println("startsWith2 :" + startsWith2);

		// Print Numbers Starts With 5
		System.out.print("starts with 5:");
		nums3.stream().filter(n -> n.toString().startsWith("5")).forEach(System.out::println);

		// Duplicate numbers
		List<Integer> nums4 = Arrays.asList(1, 2, 2, 3, 4, 5, 6, 6, 7, 8, 8, 10);
		Set<Integer> dup = nums4.stream().filter(n -> Collections.frequency(nums4, n) > 1).collect(Collectors.toSet());
		System.out.println(dup);
		// 2nd way Duplicate
		Set<Integer> dupNum = new HashSet<Integer>();
		Set<Integer> dupliCateNum = nums4.stream().filter(n -> !dupNum.add(n)).collect(Collectors.toSet());
		System.out.println("Duplicates nos: " + dupliCateNum);
		System.out.println("unique elements form the list :" + dupNum);

		// SortNumbers
		List<Integer> nums5 = Arrays.asList(1, 2, 3, 0, 5, 6, 11, 8, 9, 10);
		List<Integer> sortedList = nums5.stream().sorted().collect(Collectors.toList());
		System.out.println("sortedList: " + sortedList);

		List<Integer> descSorted = nums5.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("descSorted :" + descSorted);

		// Limit and skip examples
		List<Integer> nums6 = Arrays.asList(1, 2, 3, 0, 5, 6, 11, 8, 9, 10);
		Integer sumBylimit = nums6.stream().limit(3).reduce((p, q) -> p + q).get();
		System.out.println("sumBylimit :" + sumBylimit);

		// skip
		Integer sumBySkip = nums6.stream().skip(8).reduce((p, q) -> p + q).get();
		System.out.println("sumBySkip :" + sumBySkip);

		// Convert string with uppercase and join them with coma
		List<String> nameList = Arrays.asList("abdul", "rohna", "hamid", "umesh");
		String collect = nameList.stream().map(n -> n.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println("upperCaeAndJoined: " + collect);

		// find the duplicates using java 8
		int[] a = { 1, 3, 4, 5, 6, 7, 7, 8, 8, 9 };

		Map<Integer, Long> mapOfNos = Arrays.stream(a).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("its occurrences : " + mapOfNos);
		Set<Integer> nos = mapOfNos.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.map(entry -> entry.getKey()).collect(Collectors.toSet());
		System.out.println("Duplicates nos are:" + nos);

		// find duplicates 3rd way
		List<Integer> nosList = Arrays.asList(1, 2, 3, 4, 4, 5, 6, 7, 8);
		Set<Integer> collect2 = nosList.stream().filter(n -> Collections.frequency(nosList, n) > 1)
				.collect(Collectors.toSet());
		System.out.println("duplicates elements using frequency :" + collect2);

		// startsWith 1 using java8
		List<String> numbers = Arrays.asList("11", "12", "32", "15");
		List<String> numsStartsWithOne = numbers.stream().filter(n -> n.startsWith("1")).collect(Collectors.toList());
		System.out.println("numsStartsWithOne:" + numsStartsWithOne);
		// map
		List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe");
		List<Integer> nameLengths = names.stream().map(String::length).collect(Collectors.toList());
		System.out.println("mapEx: " + nameLengths);

		// collect and set ex
		List<String> names1 = Arrays.asList("John", "John", "Jane", "Jack", "Doe");
		Set<String> nameSet = names.stream().collect(Collectors.toSet());
		System.out.println("nameSet:" + nameSet);

		// reduce example:
		List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
		int sum1 = numbers1.stream().reduce(0, Integer::sum);
		System.out.println("sum using reduce(): " + sum1);

		Optional<Integer> reduceSum = numbers1.stream().reduce((p, q) -> p + q);
		System.out.println("reduceSum :" + reduceSum.get());

		// limit ex
		List<String> names11 = Arrays.asList("John", "Jane", "Jack", "Doe");
		List<String> limitedNames = names11.stream().limit(3).collect(Collectors.toList());
		System.out.println("limitedNames: " + limitedNames);

		// remove duplicate string

	}

}
