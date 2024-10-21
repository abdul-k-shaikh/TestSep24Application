package test.com.oct24;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCounter {

	public static void main(String[] args) {
		System.out.println("Enter a string ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
      // word count using java8
		Map<String, Long> collect = Arrays.stream(input.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		for (Map.Entry<String, Long> mp : collect.entrySet()) {
			System.out.println(mp.getKey() + ":" + mp.getValue());
		}

		// word count using simple approach
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (Character.isWhitespace(input.charAt(i))) {
				count++;
			}
		}
		System.out.println(count + 1);
	}

}
