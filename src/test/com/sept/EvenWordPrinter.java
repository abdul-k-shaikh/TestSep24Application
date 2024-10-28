package test.com.sept;

import java.util.Scanner;
import java.util.StringTokenizer;

public class EvenWordPrinter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ");
		String input = sc.nextLine();

		StringTokenizer tokenizer = new StringTokenizer(input);
		while (tokenizer.hasMoreTokens()) {
			String eachToken = tokenizer.nextToken();
			if (eachToken.length() % 2 == 0) {
				System.out.println(eachToken);
			}
		}

	}
//input : My student are awesome!
}
