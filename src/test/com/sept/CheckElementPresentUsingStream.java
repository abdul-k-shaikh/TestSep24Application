package test.com.sept;

import java.util.Arrays;
import java.util.List;

public class CheckElementPresentUsingStream {

	public static void main(String[] args) {
		List<Integer> listInt = Arrays.asList(1, 2, 3, 4, 5, 6);
		int targetNumber = 5;
		boolean isPresent = listInt.stream().anyMatch(x -> x == targetNumber);
		if (isPresent) {
			System.out.println("Number " + targetNumber + " is present in the list.");
		} else {
			System.out.println("Number " + targetNumber + " is not present in the list.");
		}
	}

}
