package test.com.dec24;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CharCount {

	public static void main(String[] args) {
		System.out.println("test");
		String str = "abdabd";
		Map<String, Long> charCount = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("charCount:" + charCount);

	}

}
