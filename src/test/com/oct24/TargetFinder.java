package test.com.oct24;

import java.util.HashSet;
import java.util.Set;

public class TargetFinder {

	public static void main(String[] args) {
		System.out.println(TargetFinder.findNumber(new int[] { 20, 30, 10, 20, 50 }, 50));
	}

	private static boolean findNumber(int[] arr, int targetNumber) {
		Set<Integer> processedNumbers = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			int requiredNumber = targetNumber - arr[i];
			if (processedNumbers.contains(requiredNumber)) {
				System.out.println(requiredNumber);
				System.out.println(arr[i]);
				return true;
			} else {
				processedNumbers.add(arr[i]);
			}
		}
		return false;
	}

}
