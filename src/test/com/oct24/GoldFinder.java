package test.com.oct24;

import java.util.Scanner;

public class GoldFinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s1 = sc.nextLine();
		String s2 = "gold";

		// using java inbuild method
		boolean containsGold = s1.contains("gold");
		System.out.println("Does the string contain 'gold'? " + containsGold);
	}

}
