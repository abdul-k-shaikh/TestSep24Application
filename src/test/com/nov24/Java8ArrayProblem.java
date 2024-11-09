package test.com.nov24;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8ArrayProblem {

	private static void fetchSeondSmallest(int[] numbers) {
		int secondLargest = Arrays.stream(numbers).sorted().skip(1).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Arrays does not haev second largest element"));
		System.out.println("secondLargest :" + secondLargest);

	}

	private static void fetchCommonElements(int[] a, int[] b) {
		List<Integer> commonEle = Arrays.stream(a).filter(num -> Arrays.stream(b).anyMatch(n -> n == num)).boxed()
				.collect(Collectors.toList());
		System.out.println("commonElement: " + commonEle);
	}

	private static void reverseGivenArrayInPlace(int[] a) {
		IntStream.range(0, a.length / 2).forEach(i -> {
			int temp = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = temp;
		});
		System.out.println("Reversed Array:" + Arrays.toString(a));
	}

	private static void fetchLongestString(String[] s) {
		int longestString = Arrays.stream(s).mapToInt(string -> string.length()).max().orElse(0);
		System.out.println("longestString :" + longestString);
	}

	public static void main(String[] args) {
		int numbers[] = { 5, 2, 8, 3, 1 };
		// if we have duplicates then use distinct() then sorted() so on
		fetchSeondSmallest(numbers);

		System.out.println("************************************");
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 4, 5, 6, 7, 8 };
		fetchCommonElements(a, b);

		System.out.println("************************************");
		int c[] = { 1, 2, 3, 4, 5 };
		reverseGivenArrayInPlace(a);

		System.out.println("************************************");
		String s[] = { "apple", "kiwi", "banana", "pomegranate" };
		fetchLongestString(s);

		System.out.println("*******Removing Duplicates*******");
		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 56, 5, 5);
		Set<Integer> uni = new HashSet<Integer>();
		List<Integer> collect = asList.stream().filter(n -> !uni.add(n)).collect(Collectors.toList());
		System.out.println("collect Uniq:" + collect);
	}

}
