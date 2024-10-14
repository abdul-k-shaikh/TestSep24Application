package test.com.oct24;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		
		//String example
		Predicate<String> p = s -> (s.length() > 5);

		System.out.println(p.test("abdul"));
		System.out.println(p.test("bharath"));
		
		//Int example
		Predicate<Integer>num = n->n>10;
		System.out.println(num.test(100));

	}

}
