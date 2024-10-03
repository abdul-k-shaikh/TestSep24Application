package test.com.oct24.java17;

public class SwitchWithMultipleCaseLabelDemo {

	public static void main(String[] args) {
		System.out.println("*****Before Java 17*****");
		beforeJava17WithMultipleCaseValue(2);
		beforeJava17WithMultipleCaseValue(3);
		beforeJava17WithMultipleCaseValue(1);

		System.out.println();

		System.out.println("***** Java 17*****");
		java17WithMultipleCaseValue(2);
	}

	private static void java17WithMultipleCaseValue(int number) {
		switch (number) {
		case 1 -> System.out.println("one");
		case 2, 3, 4 -> System.out.println("one, three or four");
		default -> System.out.println("unknown");
		}
	}

	private static void beforeJava17WithMultipleCaseValue(int number) {
		switch (number) {
		case 1:
			System.out.println("one");
			break;
		case 2:
		case 3:
		case 4:
			System.out.println("two, three or four");
			break;
		default:
			System.out.println("unknown");
			break;
		}
	}

}
