package test.com.oct24;

import java.util.HashSet;
import java.util.Set;

public class TargetFinder {

	public static void main(String[] args) {
		System.out.println(TargetFinder.findNumber(new int[] { 20, 30, 10, 20, 50 }, 40));
	}

	private static boolean findNumber(int[] arr, int targetNumber) {
		Set<Integer> processedNumbers = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			int requiredNumber = targetNumber - arr[i];
			if (processedNumbers.contains(requiredNumber)) {
				return true;
			}else {
				processedNumbers.add(arr[i]);
			}
		}
		return false;
	}

}
