package test.com.nov24;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharTest {

	public static void main(String[] args) {
        String str = "johndheere";
        Map<String, Long> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("collect :"+ collect);
	}

}
