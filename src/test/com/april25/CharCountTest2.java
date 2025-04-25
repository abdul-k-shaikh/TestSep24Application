package test.com.april25;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCountTest2 {

	public static void main(String[] args) {
		String str = "abdulabdula";
		Map<String, Long> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("char count :"+ collect);
	}

}
