package test.com.sept;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String inputString = "OneSpace TwoSpaces  ThreeSpaces   FourSpaces    Tab        End";
		char[] charArray = inputString.toCharArray();
		String stringWithOutSpace = " ";
		for (int i = 0; i < charArray.length; i++) {
			if ((charArray[i] != ' ') && (charArray[i] != '\t')) {
				stringWithOutSpace = stringWithOutSpace + charArray[i];
			}
		}
		System.out.println("input string :" + inputString);
		System.out.println("Input String Without Spaces :" + stringWithOutSpace);

	}

}
