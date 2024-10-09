package test.com.oct24;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormat {

	public static void main(String[] args) {
//Java 12 : compact number format
		NumberFormat format = NumberFormat.getCompactNumberInstance();
		System.out.println(format.format(1000));
		NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
		System.out.println(format.format(1000));
		System.out.println(format.format(1000000));
	}

}
