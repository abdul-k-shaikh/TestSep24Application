package test.com;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCounttest1 {

	public static void main(String[] args) {
		String str = "abdulabdul";
		Map<String, Long> charOccurrences = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("charOccurrences :" + charOccurrences);
	}

}
