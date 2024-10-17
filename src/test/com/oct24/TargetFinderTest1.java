package test.com.oct24;

import java.util.HashSet;
import java.util.Set;

public class TargetFinderTest1 {

	public static void main(String[] args) {
		System.out.println(TargetFinderTest1.findNumber(new int[] { 20, 30, 10, 20, 50 }, 50));
	}

	private static boolean findNumber(int[] arr, int target) {
		Set<Integer>processedNum = new HashSet<Integer>();
		for(int i=0; i<arr.length; i++) {
			int requiredNum = target-arr[i];
			if(processedNum.contains(requiredNum)) {
				return true;
			}
			else {
				processedNum.add(requiredNum);
			}
		}
		return false;
	}

}
