package test.com.nov24.truist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PlayGround1 {

	public static void main(String[] args) {
//		Create Array of String, remove duplicate , show output string sorting 
//		in ascending order.
		// mtd 1
		String[] stringArr = { "apple", "banana", "apple", "orange", "banana", "kiwi" };
		List<String> removedDupliAndSorted = Arrays.stream(stringArr).distinct().sorted().collect(Collectors.toList());
		System.out.println("removedDupliAndSorted :" + removedDupliAndSorted);

		// mtd 2
		Set<String> uniqueSortedSet = Arrays.stream(stringArr).collect(Collectors.toCollection(TreeSet::new));
		System.out.println("uniqueSortedSet" + uniqueSortedSet);

		// 2nd largest element ,op:5
		int a[] = { 5, 2, 8, 3, 1 };
		Integer secondLargest = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("secondLargest: " + secondLargest);

		// char count
		String str = "abdul";
		Map<String, Long> collect = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("char count :" + collect);

		// find nums starting with 5
		List<Integer> nums = Arrays.asList(1, 55, 50, 34, 55);
		nums.stream().filter(n -> n.toString().startsWith("5")).forEach(System.out::println);
		System.out.println("Starts with 5");

		System.err.println("Removing the duplicates");
		Set<Integer> uniqueElements = new HashSet<Integer>();
		List<Integer> uniq = nums.stream().filter(x -> !uniqueElements.add(x)).collect(Collectors.toList());
		System.out.println("removed duplicates: " + uniq);
		System.out.println("unique elements: " + uniqueElements);

		// Q. use java8 show me the length of each string and store them in map
		List<String> list = Arrays.asList("apple", "orange", "kiwi", "banana");
		Map<String, Integer> fruitLength = list.stream()
				.collect(Collectors.toMap(fruit -> fruit, fruit -> fruit.length()));
		System.out.println("fruitLength :" + fruitLength);
		// output-> fruitLength :{orange=6, banana=6, apple=5, kiwi=4}

		// Q. find the occurrences of each fruits
		List<String> fruitList = Arrays.asList("apple", "orange", "kiwi", "banana", "apple");
		Map<String, Long> fruitCount = fruitList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("fruitCount :" + fruitCount);
		// ouput:fruitCount :{banana=1, orange=1, apple=2, kiwi=1}

		// Q. count each chars
		String s = "aaayyycccvvvbbaa";
		Map<Character, Long> charCount = s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("charCount:" + charCount);
		// output:charCount:{a=5, b=2, c=3, v=3, y=3}

		// Q pritn nums startes with one
		List<String> numList = Arrays.asList("12", "22", "15", "20");
		List<String> collect2 = numList.stream().filter(x -> x.startsWith("1")).collect(Collectors.toList());
		System.out.println("nums startes with 1:" + collect2);

		// Q remove duplicates
		String[] stringArr1 = { "apple", "banana", "apple", "orange", "banana", "kiwi" };
		List<String> uniqueData = Arrays.stream(stringArr1).distinct().collect(Collectors.toList());
		System.out.println("removed duplicates:" + uniqueData);

		// given list of fruit store them and its length
		List<String> fl = Arrays.asList("apple", "kiwi", "banana", "ginger");
		Map<String, Integer> fruitMap = fl.stream().collect(Collectors.toMap(fruit -> fruit, fruit -> fruit.length()));
		System.out.println("fruitMap :" + fruitMap);
	}

}
