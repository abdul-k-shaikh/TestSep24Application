package test.com.oct24;

import java.util.Scanner;

public class AddDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = sc.next();

		StringBuffer output = new StringBuffer();
		for (int i = 0; i < input.length(); i++) {
			output.append(input.charAt(i));
			output.append(input.charAt(i));
		}
		System.out.println(output);
	}

}
