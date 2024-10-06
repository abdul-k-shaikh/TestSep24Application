package test.com.sept;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		// 1. counting words
		String input1 = "java is oop language";
		Map<String, Long> countWords = Arrays.stream(input1.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("countWords" + countWords);

		// 2. counting chars
		String input2 = "java is oop language";
		Map<String, Long> countChars = Arrays.stream(input1.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("countChars" + countChars);

	}

}
