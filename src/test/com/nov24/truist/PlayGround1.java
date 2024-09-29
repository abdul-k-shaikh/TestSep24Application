package test.com.nov24.truist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
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
		String str = "aabdul";
		Map<String, Long> collect = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("char countTes :" + collect);

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

		// char count
		String str1 = "aaayyycccvvvbbaa";
		Map<Character, Long> charCount2 = str1.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("charCount2 :" + charCount2);

		System.out.println("+++++++++++++++++17+11+2024++++++++++++++++");
		// 1.count occurrence of each character in given string
		String strSun = "javaisjava";
		Map<Character, Long> collect3 = strSun.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("charCount" + collect3);
		// 1.1
		Map<String, Long> collect4 = Arrays.stream(strSun.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("char count using split :" + collect4);

		// 1.2 find all duplicates elements
		List<String> collect5 = Arrays.stream(strSun.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() >= 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("duplicates values :" + collect5);

		// 1.3 use above code to find unique elements
		List<String> uniqueElements6 = Arrays.stream(strSun.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("uniqueElements6 :" + uniqueElements6);

		// 1.4 first non repeated element from a string
		String firstNonRepeatedElement = Arrays.stream(strSun.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();
		System.out.println("firstNonRepeatedElement :" + firstNonRepeatedElement);

		// 1.5 first repeated element from a string
		String firstRepatedElement = Arrays.stream(strSun.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() >= 1).findFirst().get().getKey();
		System.out.println("firstRepatedElement: " + firstRepatedElement);

		// 2.0 find second highest number from given array
		int[] numbers = { 5, 9, 11, 2, 8, 21, 1 };
		Integer SecondHighest = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.get();
		System.out.println("SecondHighest :" + SecondHighest);

	}

}
