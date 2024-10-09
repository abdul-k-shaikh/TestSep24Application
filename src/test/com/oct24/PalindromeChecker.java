package test.com.oct24;

public class PalindromeChecker {

	public static boolean isPalindrome(String input) {
		if (input == null) {
			throw new IllegalArgumentException("input can not be null");
		}
		StringBuilder sb = new StringBuilder(input).reverse();
		return sb.toString().equals(input);
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("malayalam"));
	}

}
