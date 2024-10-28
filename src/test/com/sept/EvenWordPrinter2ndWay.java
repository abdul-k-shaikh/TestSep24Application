package test.com.sept;

public class EvenWordPrinter2ndWay {

	public static void main(String[] args) {
		String str = "my students are awesome!";
		String[] words = str.split(" ");
		for (String word : words) {
			if (word.length() % 2 == 0) {
				System.out.println(word);
			}
		}
	}

}
