package test.com.nov24;

import java.util.ArrayList;

public class CustomeArrayList extends ArrayList {

	@Override
	public boolean add(Object o) {
		if (this.contains(o)) {
			return true;
		} else {
			return super.add(o);
		}
	}
	public static void main(String[] args) {
		CustomeArrayList list1 = new CustomeArrayList();
		list1.add(1);
		list1.add(1);
		list1.add(1);
		list1.add(2);

		System.out.println(list1);
	}
}
