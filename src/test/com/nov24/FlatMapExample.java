package test.com.nov24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

	public static void main(String[] args) {
		List<List<String>> listOfLists = Arrays.asList(Arrays.asList("a", "b", "c"), Arrays.asList("d", "e", "f"),
				Arrays.asList("g", "h", "i"));
		List<String> flatList = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println("flatList: " + flatList);
	}

}
