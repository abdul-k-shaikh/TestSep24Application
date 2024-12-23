package test.com.dec24;

import java.util.stream.IntStream;

public class ImperativeVsDeclarative {

	public static void main(String[] args) {
		/**
		 * imperative how style of coding
		 * 
		 */
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("sum using imerative approach :" + sum);

		/**
		 * declarative style of programing - what style of programming
		 * 
		 */
		int sum2 = IntStream.rangeClosed(0, 100).sum();
		System.out.println("sum using Declarative approach :" + sum2);
	}

}
