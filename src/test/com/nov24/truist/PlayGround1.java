package test.com.nov24.truist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
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
		
		//

	}

}
