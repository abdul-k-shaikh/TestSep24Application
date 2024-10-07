package test.com.oct24;

public class VowelRemover {

	public static void main(String[] args) {
		String input = "he is working on java";
		StringBuffer output = new StringBuffer();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
					|| input.charAt(i) == 'u') {
				continue;

			} else {
				output.append(input.charAt(i));
			}
		}

		// above task can be done in single line
		String replaceAll = input.replaceAll("[aeiou]", "");
		System.out.println("using inbuild mtd: " + replaceAll);
		System.out.println(output);
	}

}
