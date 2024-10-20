package test.com.oct24;

import java.util.Scanner;

public class StringEndChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String s1 = sc.next();
		System.out.println("Enter Second String");
		String s2 = sc.next();
		int count = 0;
		for (int i = s1.length() - 1, j = s2.length() - 1; j >= 0; i--, j--) {
			if (s1.charAt(i) == s2.charAt(j)) {
				count++;
			}
		}
		if (count == s2.length()) {
			System.out.println("Yes");
		} else {
			System.out.println("NO");
		}
		sc.close();

		// Using inbuild method to check string ends with second string
		boolean endsWith = s1.endsWith(s2);
		System.out.println("Using Inbuild method: " + endsWith);

	}

}
