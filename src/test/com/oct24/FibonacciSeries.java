package test.com.oct24;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num1 = 0, num2 = 1, fib;
		System.out.print(num1 + " " + num1);
		int count = 15;
		for (int i = 0; i < count; i++) {
			fib = num1 + num2;
			num1 = num2;
			num2 = fib;
			System.out.print(" " + fib);
		}
	}

}
