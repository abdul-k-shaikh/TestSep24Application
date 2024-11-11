package test.com.nov24;

import java.util.HashSet;
import java.util.Set;

public class TargetFinder {

	public static void main(String[] args) {
		System.out.println(TargetFinder.findNumber(new int[] { 10, 20, 30, 40 }, 50));
	}

	private static boolean findNumber(int[] arr, int target) {
		Set<Integer> processedNum = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			int requiredNum = target - arr[i];
			if (processedNum.contains(requiredNum)) {
				System.out.println(requiredNum);
				System.out.println(arr[i]);
				
				return true;
			} else {
				processedNum.add(arr[i]);
			}
		}
		return false;
	}

}
