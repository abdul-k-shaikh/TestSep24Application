package test.com.sept;

import java.util.Scanner;

public class StringEncoder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = sc.next();
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			output = output + (char) (input.charAt(i) + 1);
		}
		System.out.println(output);
	}

}
