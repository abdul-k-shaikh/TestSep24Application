package test.com.oct24;

import java.util.Scanner;

public class ReverseString {
	// String reverse
	public static void main(String[] args) {
		System.out.println("Enter a string ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
		System.out.println(output);
		System.out.println(new StringBuffer(input).reverse());
	}

}
