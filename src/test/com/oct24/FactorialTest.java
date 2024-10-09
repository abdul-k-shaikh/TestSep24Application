package test.com.oct24;

public class FactorialTest {

	public static void main(String[] args) {
		System.out.println(FactorialTest.recursiveFactorial(5));
	}

	// normal wasy to find fact
//	public static int Factorial(int num) {
//		int result = 1;
//		for (int i = 1; i <= num; i++) {
//			result = result * i;
//		}
//		return result;
//	}

	// recursive way
	public static int recursiveFactorial(int num) {
		int result = 1;
		if (num == 0) {
			return 1;
		} else {
			return (num * recursiveFactorial(num - 1));
		}
	}

}
