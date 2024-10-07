package test.com.oct24;

import java.util.Arrays;
import java.util.Scanner;

public class GoldFinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s1 = sc.nextLine();
		String s2 = "gold";

		// using java inbuild method
		boolean containsGold1 = s1.contains("gold");
		System.out.println("Does the string contain 'gold'? " + containsGold1);

		// using java 8 streams
		boolean containsGold2 = Arrays.stream(s1.split(" ")).anyMatch("gold"::equals); // It’s shorthand
																						// for:.anyMatch(element ->
																						// element.equals("gold"));

		System.out.println("Does the string contain 'gold'? " + containsGold2);
	}

}
