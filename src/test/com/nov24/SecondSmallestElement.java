package test.com.nov24;

import java.util.Arrays;
import java.util.Comparator;

public class SecondSmallestElement {

	public static void main(String[] args) {
		int a[] = { 5, 2, 8, 3, 1 };
		// 1. Find 2nd smallest number
		int secondSmallest = Arrays.stream(a).boxed().sorted().skip(1).findFirst()
				.orElseThrow(() -> new IllegalStateException("Array does not have a second smallest element."));
		System.out.println("secondSmallest: " + secondSmallest);

		// Find 2nd smallest number in 2nd way
		Integer secondSmallest1 = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).skip(3).limit(1)
				.findFirst().get();
		System.out.println("secondSmallest1 :" + secondSmallest1);
		
	
	}

}
